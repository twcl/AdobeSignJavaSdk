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


package com.adobe.sign.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ParticipantSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class ParticipantSetInfo {
  @SerializedName("label")
  private String label = null;

  @SerializedName("memberInfos")
  private List<ParticipantSetMemberInfo> memberInfos = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("privateMessage")
  private String privateMessage = null;

  /**
   * Role assumed by all participants in the set (signer, approver etc.)
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SIGNER("SIGNER"),
    
    APPROVER("APPROVER"),
    
    ACCEPTOR("ACCEPTOR"),
    
    CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"),
    
    FORM_FILLER("FORM_FILLER"),
    
    DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
    
    DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
    
    DELEGATE_TO_ACCEPTOR("DELEGATE_TO_ACCEPTOR"),
    
    DELEGATE_TO_CERTIFIED_RECIPIENT("DELEGATE_TO_CERTIFIED_RECIPIENT"),
    
    DELEGATE_TO_FORM_FILLER("DELEGATE_TO_FORM_FILLER"),
    
    SHARE("SHARE");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("visiblePages")
  private List<String> visiblePages = null;

  public ParticipantSetInfo label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The unique label of a participant set.&lt;br&gt;For custom workflows, label specified in the participation set should map it to the participation step in the custom workflow.
   * @return label
  **/
  @ApiModelProperty(value = "The unique label of a participant set.<br>For custom workflows, label specified in the participation set should map it to the participation step in the custom workflow.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ParticipantSetInfo memberInfos(List<ParticipantSetMemberInfo> memberInfos) {
    this.memberInfos = memberInfos;
    return this;
  }

  public ParticipantSetInfo addMemberInfosItem(ParticipantSetMemberInfo memberInfosItem) {
    if (this.memberInfos == null) {
      this.memberInfos = new ArrayList<ParticipantSetMemberInfo>();
    }
    this.memberInfos.add(memberInfosItem);
    return this;
  }

   /**
   * Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set
   * @return memberInfos
  **/
  @ApiModelProperty(value = "Array of ParticipantInfo objects, containing participant-specific data (e.g. email). All participants in the array belong to the same set")
  public List<ParticipantSetMemberInfo> getMemberInfos() {
    return memberInfos;
  }

  public void setMemberInfos(List<ParticipantSetMemberInfo> memberInfos) {
    this.memberInfos = memberInfos;
  }

  public ParticipantSetInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the participant set (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255
   * @return name
  **/
  @ApiModelProperty(value = "Name of the participant set (it can be empty, but needs not to be unique in a single agreement). Maximum no of characters in participant set name is restricted to 255")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ParticipantSetInfo order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Index indicating position at which signing group needs to sign. Signing group to sign at first place is assigned a 1 index. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid. No signingOrder should be specified for SHARE role
   * @return order
  **/
  @ApiModelProperty(value = "Index indicating position at which signing group needs to sign. Signing group to sign at first place is assigned a 1 index. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid. No signingOrder should be specified for SHARE role")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ParticipantSetInfo privateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
    return this;
  }

   /**
   * Participant set&#39;s private message - all participants in the set will receive the same message
   * @return privateMessage
  **/
  @ApiModelProperty(value = "Participant set's private message - all participants in the set will receive the same message")
  public String getPrivateMessage() {
    return privateMessage;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  public ParticipantSetInfo role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Role assumed by all participants in the set (signer, approver etc.)
   * @return role
  **/
  @ApiModelProperty(value = "Role assumed by all participants in the set (signer, approver etc.)")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public ParticipantSetInfo visiblePages(List<String> visiblePages) {
    this.visiblePages = visiblePages;
    return this;
  }

  public ParticipantSetInfo addVisiblePagesItem(String visiblePagesItem) {
    if (this.visiblePages == null) {
      this.visiblePages = new ArrayList<String>();
    }
    this.visiblePages.add(visiblePagesItem);
    return this;
  }

   /**
   * When you enable limited document visibility (documentVisibilityEnabled), you can specify which file (fileInfo) should be made visible to which specific participant set.&lt;br&gt;Specify one or more label values of a fileInfos element.&lt;br&gt;Each signer participant sets must contain at least one required signature field in at least one visible file included in this API call; if not a page with a signature field is automatically appended for any missing participant sets. If there is a possibility that one or more participant sets do not have a required signature field in the files included in the API call, all signer participant sets should include a special index value of &#39;0&#39; to make this automatically appended signature page visible to the signer. Not doing so may result in an error. For all other roles, you may omit this value to exclude this page.
   * @return visiblePages
  **/
  @ApiModelProperty(value = "When you enable limited document visibility (documentVisibilityEnabled), you can specify which file (fileInfo) should be made visible to which specific participant set.<br>Specify one or more label values of a fileInfos element.<br>Each signer participant sets must contain at least one required signature field in at least one visible file included in this API call; if not a page with a signature field is automatically appended for any missing participant sets. If there is a possibility that one or more participant sets do not have a required signature field in the files included in the API call, all signer participant sets should include a special index value of '0' to make this automatically appended signature page visible to the signer. Not doing so may result in an error. For all other roles, you may omit this value to exclude this page.")
  public List<String> getVisiblePages() {
    return visiblePages;
  }

  public void setVisiblePages(List<String> visiblePages) {
    this.visiblePages = visiblePages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantSetInfo participantSetInfo = (ParticipantSetInfo) o;
    return Objects.equals(this.label, participantSetInfo.label) &&
        Objects.equals(this.memberInfos, participantSetInfo.memberInfos) &&
        Objects.equals(this.name, participantSetInfo.name) &&
        Objects.equals(this.order, participantSetInfo.order) &&
        Objects.equals(this.privateMessage, participantSetInfo.privateMessage) &&
        Objects.equals(this.role, participantSetInfo.role) &&
        Objects.equals(this.visiblePages, participantSetInfo.visiblePages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, memberInfos, name, order, privateMessage, role, visiblePages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantSetInfo {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    memberInfos: ").append(toIndentedString(memberInfos)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    privateMessage: ").append(toIndentedString(privateMessage)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    visiblePages: ").append(toIndentedString(visiblePages)).append("\n");
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

