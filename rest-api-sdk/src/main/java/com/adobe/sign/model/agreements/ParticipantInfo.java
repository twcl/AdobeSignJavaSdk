/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.agreements.ParticipantSetInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-23T20:24:55.658+05:30")
public class ParticipantInfo   {
  
  private List<ParticipantSetInfo> alternateParticipants = new ArrayList<ParticipantSetInfo>();
  private String company = null;
  private String email = null;
  private String name = null;
  private String participantId = null;

public enum SecurityOptionsEnum {
  PASSWORD("PASSWORD"),
  WEB_IDENTITY("WEB_IDENTITY"),
  KBA("KBA"),
  PHONE("PHONE"),
  OTHER("OTHER");

  private String value;

  SecurityOptionsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<SecurityOptionsEnum> securityOptions = new ArrayList<SecurityOptionsEnum>();
  private String title = null;

  
  /**
   * All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE
   **/
  @ApiModelProperty(value = "All the child participants of the current participant. The possible values for the status of these participants are, SHARE and DELEGATE")
  @JsonProperty("alternateParticipants")
  public List<ParticipantSetInfo> getAlternateParticipants() {
    return alternateParticipants;
  }
  public void setAlternateParticipants(List<ParticipantSetInfo> alternateParticipants) {
    this.alternateParticipants = alternateParticipants;
  }

  
  /**
   * The company of the participant, if available
   **/
  @ApiModelProperty(value = "The company of the participant, if available")
  @JsonProperty("company")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  
  /**
   * The email address of the participant
   **/
  @ApiModelProperty(required = true, value = "The email address of the participant")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * The name of the participant, if available
   **/
  @ApiModelProperty(value = "The name of the participant, if available")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The unique identifier of the participant
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the participant")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  
  /**
   * Security options that apply to the participant
   **/
  @ApiModelProperty(value = "Security options that apply to the participant")
  @JsonProperty("securityOptions")
  public List<SecurityOptionsEnum> getSecurityOptions() {
    return securityOptions;
  }
  public void setSecurityOptions(List<SecurityOptionsEnum> securityOptions) {
    this.securityOptions = securityOptions;
  }

  
  /**
   * The title of the participant, if available
   **/
  @ApiModelProperty(value = "The title of the participant, if available")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantInfo {\n");
    
    sb.append("    alternateParticipants: ").append(StringUtil.toIndentedString(alternateParticipants)).append("\n");
    sb.append("    company: ").append(StringUtil.toIndentedString(company)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    participantId: ").append(StringUtil.toIndentedString(participantId)).append("\n");
    sb.append("    securityOptions: ").append(StringUtil.toIndentedString(securityOptions)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
