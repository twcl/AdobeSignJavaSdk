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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * AgreementCancellationInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class AgreementCancellationInfo {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("notifyOthers")
  private Boolean notifyOthers = null;

  public AgreementCancellationInfo comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * An optional comment describing to the recipients why you want to cancel the transaction
   * @return comment
  **/
  @ApiModelProperty(value = "An optional comment describing to the recipients why you want to cancel the transaction")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AgreementCancellationInfo notifyOthers(Boolean notifyOthers) {
    this.notifyOthers = notifyOthers;
    return this;
  }

   /**
   * Whether or not you would like the recipients to be notified that the transaction has been cancelled. The default value is false
   * @return notifyOthers
  **/
  @ApiModelProperty(value = "Whether or not you would like the recipients to be notified that the transaction has been cancelled. The default value is false")
  public Boolean isNotifyOthers() {
    return notifyOthers;
  }

  public void setNotifyOthers(Boolean notifyOthers) {
    this.notifyOthers = notifyOthers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementCancellationInfo agreementCancellationInfo = (AgreementCancellationInfo) o;
    return Objects.equals(this.comment, agreementCancellationInfo.comment) &&
        Objects.equals(this.notifyOthers, agreementCancellationInfo.notifyOthers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, notifyOthers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementCancellationInfo {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    notifyOthers: ").append(toIndentedString(notifyOthers)).append("\n");
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
