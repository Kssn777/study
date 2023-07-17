package BIO;


import lombok.Data;

@Data
public class MyResponse {
    private StringBuilder response;
    private final static String split = "\r\n";

    public MyResponse(){}

    public MyResponse setHeader(String key, String value){
        response.append(key+": "+value+ split);
        return this;
    }

    public MyResponse ok(){
        this.response = new StringBuilder();
        response.append("HTTP1.1 200 OK" + split);
        return this;
    }

    public MyResponse setMessage(Object object){
        response.append(split);
        response.append(object.toString());
        return this;
    }

    public byte[] getResult(){
        return response.toString().getBytes();
    }


}
