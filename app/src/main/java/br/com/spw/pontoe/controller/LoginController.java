package br.com.spw.pontoe.controller;

import br.com.spw.pontoe.activity.LoginActivity;

/**
 * Created by ferrari on 07/06/2017.
 */

public class LoginController extends BaseActivityController<LoginActivity> {

    public LoginController(LoginActivity activity) {
        super(activity);
    }

    public void login(final String cpf, final String password) {


    }


    public long castCoordenada(double coordenada) {
        String str = String.valueOf(coordenada);
        str = str.replace(".", "").replace(",", "");
        return Long.valueOf(str);
    }

    public String extractJSESSSIONID(String setCookie) {
        String jsessionid = "";
        if (setCookie != null) {
            if (setCookie.indexOf(";") > -1) {
                String[] headers = setCookie.split(";");

                for (String header : headers) {
                    if (header.indexOf("JSESSIONID") > -1) {
                        jsessionid = header;
                        jsessionid = jsessionid.replace("JSESSIONID=", "");
                    }
                }
            }
        }

        return jsessionid;
    }
}

