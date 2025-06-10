package com.newsblur.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class HostnameVerifierCustom implements HostnameVerifier {
    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
