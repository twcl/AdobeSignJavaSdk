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


package com.adobe.sign.model.webhooks;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebhookConditionalParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:53.118+05:30")
public class WebhookConditionalParams {
  @SerializedName("webhookAgreementEvents")
  private WebhookAgreementEvents webhookAgreementEvents = null;

  @SerializedName("webhookLibraryDocumentEvents")
  private WebhookLibraryDocumentEvents webhookLibraryDocumentEvents = null;

  @SerializedName("webhookMegaSignEvents")
  private WebhookMegaSignEvents webhookMegaSignEvents = null;

  @SerializedName("webhookWidgetEvents")
  private WebhookWidgetEvents webhookWidgetEvents = null;

  public WebhookConditionalParams webhookAgreementEvents(WebhookAgreementEvents webhookAgreementEvents) {
    this.webhookAgreementEvents = webhookAgreementEvents;
    return this;
  }

   /**
   * Conditional parameters for webhook agreement events
   * @return webhookAgreementEvents
  **/
  @ApiModelProperty(value = "Conditional parameters for webhook agreement events")
  public WebhookAgreementEvents getWebhookAgreementEvents() {
    return webhookAgreementEvents;
  }

  public void setWebhookAgreementEvents(WebhookAgreementEvents webhookAgreementEvents) {
    this.webhookAgreementEvents = webhookAgreementEvents;
  }

  public WebhookConditionalParams webhookLibraryDocumentEvents(WebhookLibraryDocumentEvents webhookLibraryDocumentEvents) {
    this.webhookLibraryDocumentEvents = webhookLibraryDocumentEvents;
    return this;
  }

   /**
   * Conditional parameters for webhook library document events
   * @return webhookLibraryDocumentEvents
  **/
  @ApiModelProperty(value = "Conditional parameters for webhook library document events")
  public WebhookLibraryDocumentEvents getWebhookLibraryDocumentEvents() {
    return webhookLibraryDocumentEvents;
  }

  public void setWebhookLibraryDocumentEvents(WebhookLibraryDocumentEvents webhookLibraryDocumentEvents) {
    this.webhookLibraryDocumentEvents = webhookLibraryDocumentEvents;
  }

  public WebhookConditionalParams webhookMegaSignEvents(WebhookMegaSignEvents webhookMegaSignEvents) {
    this.webhookMegaSignEvents = webhookMegaSignEvents;
    return this;
  }

   /**
   * Conditional parameters for webhook megasign events
   * @return webhookMegaSignEvents
  **/
  @ApiModelProperty(value = "Conditional parameters for webhook megasign events")
  public WebhookMegaSignEvents getWebhookMegaSignEvents() {
    return webhookMegaSignEvents;
  }

  public void setWebhookMegaSignEvents(WebhookMegaSignEvents webhookMegaSignEvents) {
    this.webhookMegaSignEvents = webhookMegaSignEvents;
  }

  public WebhookConditionalParams webhookWidgetEvents(WebhookWidgetEvents webhookWidgetEvents) {
    this.webhookWidgetEvents = webhookWidgetEvents;
    return this;
  }

   /**
   * Conditional parameters for webhook widget events
   * @return webhookWidgetEvents
  **/
  @ApiModelProperty(value = "Conditional parameters for webhook widget events")
  public WebhookWidgetEvents getWebhookWidgetEvents() {
    return webhookWidgetEvents;
  }

  public void setWebhookWidgetEvents(WebhookWidgetEvents webhookWidgetEvents) {
    this.webhookWidgetEvents = webhookWidgetEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConditionalParams webhookConditionalParams = (WebhookConditionalParams) o;
    return Objects.equals(this.webhookAgreementEvents, webhookConditionalParams.webhookAgreementEvents) &&
        Objects.equals(this.webhookLibraryDocumentEvents, webhookConditionalParams.webhookLibraryDocumentEvents) &&
        Objects.equals(this.webhookMegaSignEvents, webhookConditionalParams.webhookMegaSignEvents) &&
        Objects.equals(this.webhookWidgetEvents, webhookConditionalParams.webhookWidgetEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookAgreementEvents, webhookLibraryDocumentEvents, webhookMegaSignEvents, webhookWidgetEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConditionalParams {\n");
    
    sb.append("    webhookAgreementEvents: ").append(toIndentedString(webhookAgreementEvents)).append("\n");
    sb.append("    webhookLibraryDocumentEvents: ").append(toIndentedString(webhookLibraryDocumentEvents)).append("\n");
    sb.append("    webhookMegaSignEvents: ").append(toIndentedString(webhookMegaSignEvents)).append("\n");
    sb.append("    webhookWidgetEvents: ").append(toIndentedString(webhookWidgetEvents)).append("\n");
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

