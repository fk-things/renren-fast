package io.renren.modules.weidian.sdk.http;

import io.renren.modules.weidian.sdk.exception.OpenException;

public interface HttpService {

  public String get(String url) throws OpenException;

  public String post(String url, Param... params) throws OpenException;

  public String multipart(String url, String name, byte[] content) throws OpenException;

}
