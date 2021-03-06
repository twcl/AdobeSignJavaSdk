/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.adobe.sign.model.widgets;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * WidgetRedirectionInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:50:01.583+05:30")
public class WidgetRedirectionInfo {
  @SerializedName("deframe")
  private Boolean deframe = null;

  @SerializedName("delay")
  private Integer delay = null;

  @SerializedName("url")
  private String url = null;

  public WidgetRedirectionInfo deframe(Boolean deframe) {
    this.deframe = deframe;
    return this;
  }

   /**
   * If deframe is false, the resultant page will be shown inside the widget frame. If deframe is true, the resultant page will be shown in the full browser window.   Note that in the case of embedded widgets, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for embedded widgets
   * @return deframe
  **/
  @ApiModelProperty(value = "If deframe is false, the resultant page will be shown inside the widget frame. If deframe is true, the resultant page will be shown in the full browser window.   Note that in the case of embedded widgets, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for embedded widgets")
  public Boolean isDeframe() {
    return deframe;
  }

  public void setDeframe(Boolean deframe) {
    this.deframe = deframe;
  }

  public WidgetRedirectionInfo delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * The delay (in seconds) before the user is taken to the resultant page. If this value is greater than 0, the user will first see the standard Adobe Sign result message, and then after a delay will be redirected to your resultant page.   Note that this parameter has no effect for embedded widgets when deframe is true
   * @return delay
  **/
  @ApiModelProperty(value = "The delay (in seconds) before the user is taken to the resultant page. If this value is greater than 0, the user will first see the standard Adobe Sign result message, and then after a delay will be redirected to your resultant page.   Note that this parameter has no effect for embedded widgets when deframe is true")
  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public WidgetRedirectionInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A publicly accessible url to which the user will be sent after successfully completing the widget.  If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed.  In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget
   * @return url
  **/
  @ApiModelProperty(value = "A publicly accessible url to which the user will be sent after successfully completing the widget.  If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed.  In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetRedirectionInfo widgetRedirectionInfo = (WidgetRedirectionInfo) o;
    return Objects.equals(this.deframe, widgetRedirectionInfo.deframe) &&
        Objects.equals(this.delay, widgetRedirectionInfo.delay) &&
        Objects.equals(this.url, widgetRedirectionInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deframe, delay, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetRedirectionInfo {\n");
    
    sb.append("    deframe: ").append(toIndentedString(deframe)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

