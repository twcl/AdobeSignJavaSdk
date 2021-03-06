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


package com.adobe.sign.model.users;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserGroupInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:31.257+05:30")
public class UserGroupInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("isGroupAdmin")
  private Boolean isGroupAdmin = null;

  @SerializedName("name")
  private String name = null;

  public UserGroupInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the group
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the group")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserGroupInfo isGroupAdmin(Boolean isGroupAdmin) {
    this.isGroupAdmin = isGroupAdmin;
    return this;
  }

   /**
   * True if user is group admin.
   * @return isGroupAdmin
  **/
  @ApiModelProperty(value = "True if user is group admin.")
  public Boolean isIsGroupAdmin() {
    return isGroupAdmin;
  }

  public void setIsGroupAdmin(Boolean isGroupAdmin) {
    this.isGroupAdmin = isGroupAdmin;
  }

  public UserGroupInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the group. This will be ignored as part of PUT call.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the group. This will be ignored as part of PUT call.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupInfo userGroupInfo = (UserGroupInfo) o;
    return Objects.equals(this.id, userGroupInfo.id) &&
        Objects.equals(this.isGroupAdmin, userGroupInfo.isGroupAdmin) &&
        Objects.equals(this.name, userGroupInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGroupAdmin, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGroupAdmin: ").append(toIndentedString(isGroupAdmin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

