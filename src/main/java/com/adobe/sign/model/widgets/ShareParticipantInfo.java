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
 * ShareParticipantInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:50:01.583+05:30")
public class ShareParticipantInfo {
  @SerializedName("company")
  private String company = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("participantId")
  private String participantId = null;

  @SerializedName("sharerParticipantId")
  private String sharerParticipantId = null;

  public ShareParticipantInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company of the sharee participant of the widget, if available.
   * @return company
  **/
  @ApiModelProperty(value = "Company of the sharee participant of the widget, if available.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ShareParticipantInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the sharee participant of the widget.
   * @return email
  **/
  @ApiModelProperty(value = "Email of the sharee participant of the widget.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ShareParticipantInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sharee participant of the widget, if available.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the sharee participant of the widget, if available.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShareParticipantInfo participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }

   /**
   * The unique identifier of the sharee participant of the widget.
   * @return participantId
  **/
  @ApiModelProperty(value = "The unique identifier of the sharee participant of the widget.")
  public String getParticipantId() {
    return participantId;
  }

  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  public ShareParticipantInfo sharerParticipantId(String sharerParticipantId) {
    this.sharerParticipantId = sharerParticipantId;
    return this;
  }

   /**
   * The unique identifier of the participant who shared the widget.
   * @return sharerParticipantId
  **/
  @ApiModelProperty(value = "The unique identifier of the participant who shared the widget.")
  public String getSharerParticipantId() {
    return sharerParticipantId;
  }

  public void setSharerParticipantId(String sharerParticipantId) {
    this.sharerParticipantId = sharerParticipantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareParticipantInfo shareParticipantInfo = (ShareParticipantInfo) o;
    return Objects.equals(this.company, shareParticipantInfo.company) &&
        Objects.equals(this.email, shareParticipantInfo.email) &&
        Objects.equals(this.name, shareParticipantInfo.name) &&
        Objects.equals(this.participantId, shareParticipantInfo.participantId) &&
        Objects.equals(this.sharerParticipantId, shareParticipantInfo.sharerParticipantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, email, name, participantId, sharerParticipantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareParticipantInfo {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    sharerParticipantId: ").append(toIndentedString(sharerParticipantId)).append("\n");
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
