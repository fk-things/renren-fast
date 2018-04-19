package io.renren.modules.weidian.sdk;

import io.renren.modules.weidian.sdk.exception.OpenException;
import io.renren.modules.weidian.sdk.oauth.OAuth;
import io.renren.modules.weidian.sdk.response.oauth.OAuthResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestOAuth {

  private static final Logger LOGGER = LoggerFactory.getLogger(TestOAuth.class);

  private OAuth oauth = OAuth.getInstance();


  public void testGetPersonalToken() {
    try {
      OAuthResponse response = oauth.getPersonalToken();
      LOGGER.debug("response:{}\n", response.toString());
//      Assert.assertEquals(0, response.getStatus().getStatusCode());
    } catch (OpenException e) {
      e.printStackTrace();
    }
  }


  public void testOAuth2AuthorizeUrl() {
    try {
      String response = oauth.getOAuth2AuthorizeUrl("http://www.abc.com", "a");
      LOGGER.debug("response:{}\n", response);
//      Assert.assertNotNull(response);
    } catch (OpenException e) {
      e.printStackTrace();
    }
  }


  public void testOAuth2Token() {
    try {
      OAuthResponse response = oauth.getOAuth2Token("0c8369516b99e063df1d1f3feda7c91b");
      LOGGER.debug("response:{}\n", response.toString());
//      Assert.assertEquals(0, response.getStatus().getStatusCode());
    } catch (OpenException e) {
      e.printStackTrace();
    }
  }


  public void testRefreshOAuth2Token() {
    try {
      OAuthResponse response = oauth.refreshOAuth2Token("fa34a3eff1361aa816a28f38cb3eae1f0001970984");
      LOGGER.debug("response:{}\n", response.toString());
//      Assert.assertEquals(0, response.getStatus().getStatusCode());
    } catch (OpenException e) {
      e.printStackTrace();
    }
  }
}
