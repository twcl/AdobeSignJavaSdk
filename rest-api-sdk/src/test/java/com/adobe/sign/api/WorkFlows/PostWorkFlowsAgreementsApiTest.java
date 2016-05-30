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

package com.adobe.sign.api.WorkFlows;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.adobe.sign.api.WorkflowsApi;
import com.adobe.sign.model.workflows.AgreementCreationResponse;
import com.adobe.sign.model.workflows.CustomWorkflowAgreementCreationRequest;
import com.adobe.sign.model.workflows.CustomWorkflowFileInfo;
import com.adobe.sign.model.workflows.PostSignOptions;
import com.adobe.sign.utils.ApiUtils;
import com.adobe.sign.utils.TestData;
import com.adobe.sign.utils.TransientDocumentsUtils;
import com.adobe.sign.utils.WorkFlowUtils;
import com.adobe.sign.utils.ApiException;
import com.adobe.sign.utils.LibraryDocumentsUtils;
import com.adobe.sign.utils.validator.SdkErrorCodes;
import org.junit.Before;
import org.junit.Test;

/**
 * Junit test cases for Post WorkFlows Agreements APIs
 */
public class PostWorkFlowsAgreementsApiTest {

  private WorkflowsApi workflowsApi = null;
  private String workflowId = null;
  private String libraryDocumentId = null;
  private String transientDocumentId = null;

  @Before
  public void setup() throws ApiException {
    workflowId = WorkFlowUtils.getResourceId();
    workflowsApi = WorkFlowUtils.getWorkflowsApi();

    libraryDocumentId = LibraryDocumentsUtils.getResourceId(TestData.LIBRARY_DOCUMENT_NAME);
    transientDocumentId = TransientDocumentsUtils.createTransientDocumentResource(TestData.TRANSIENT_DOCUMENT_NAME);
  }

  /**
   * Test for creating an agreement and sending it out for signature through the CreateWorkFlowAgreement endpoint. Negative scenarios covered:
   * NO_ACCESS_TOKEN_HEADER: null access token.
   * INVALID_ACCESS_TOKEN: empty access token.
   *
   * @throws ApiException
   */
  @Test
  public void testNullAndEmptyAccessToken() throws ApiException {
    CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();

    try {
      workflowsApi.createWorkflowAgreement(TestData.NULL_PARAM,
                                           workflowId,
                                           creationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.NO_ACCESS_TOKEN_HEADER.getApiCode().equals(e.getApiCode()));
    }

    try {
      workflowsApi.createWorkflowAgreement(TestData.EMPTY_PARAM,
                                           workflowId,
                                           creationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ACCESS_TOKEN.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an agreement and sending it out for signature through the CreateWorkFlowAgreement endpoint. Negative scenarios covered:
   * INVALID_X_API_USER_HEADER: empty xApiUser.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidXApiUser() throws ApiException {
    CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           creationRequest,
                                           TestData.EMPTY_PARAM);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_X_API_USER_HEADER.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an agreement and sending it out for signature through the CreateWorkFlowAgreement endpoint. Negative scenarios
   * covered:
   * INVALID_WORKFLOW_ID: null and empty workflowId.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidWorkflowId() throws ApiException {
    CustomWorkflowAgreementCreationRequest creationRequest = new CustomWorkflowAgreementCreationRequest();

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           TestData.NULL_PARAM,
                                           creationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
    }

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           TestData.EMPTY_PARAM,
                                           creationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_WORKFLOW_ID.getApiCode().equals(e.getApiCode()));
    }
  }

  /**
   * Test for creating an agreement and sending it out for signature through the createAgreement endpoint. Negative scenarios covered:
   * INVALID_FILE_INFO: FileInfo with all 4 parameters null.
   * FILE_INFO_NAME_MISSING: name field in FileInfo null.
   * MISSING_REQUIRED_PARAM: Name null in documentCreationInfo; RecipientSetRole set to null; Both email and fax empty in recipientInfo;
   * EMPTY_REDIRECT_URL: Redirect url set to empty in PostSignOptions, if specified.
   * INVALID_REDIRECT_URL: Invalid url specified in PostSignOption.
   * INVALID_REDIRECT_DELAY: Negative redirect delay set in PostSignOptions.
   * INVALID_EMAIL: Wrong email set in recipientInfo.
   * INVALID_ARGUMENTS: Both email and fax specified in RecipientInfo.
   *
   * @throws ApiException
   */
  @Test
  public void testInvalidAgreementCreationInfo() throws ApiException {
    PostSignOptions options = new PostSignOptions();
    CustomWorkflowFileInfo fileInfo = new CustomWorkflowFileInfo();

    // Null CustomWorkflowAgreementCreationRequest.
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           null,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    CustomWorkflowAgreementCreationRequest agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo,
                                                                                                                              ApiUtils.getAgreementName());
    // FileInfo null.
    agreementCreationRequest.getDocumentCreationInfo().setFileInfos(null);

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_FILE_INFO.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setWorkflowLibraryDocumentId(libraryDocumentId);
    fileInfo.setTransientDocumentId(transientDocumentId);

    // FileInfo with name missing.
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo,
                                                                                       ApiUtils.getAgreementName());

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.FILE_INFO_NAME_MISSING.getApiCode().equals(e.getApiCode()));
    }
    fileInfo.setName(TestData.AGREEMENT_NAME);
    fileInfo.setWorkflowLibraryDocumentId(TestData.NULL_PARAM);
    fileInfo.setTransientDocumentId(TestData.EMPTY_PARAM);

    // FileInfo with TransientDocumentId empty
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo,
                                                                                       ApiUtils.getAgreementName());

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_TRANSIENTDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    fileInfo.setWorkflowLibraryDocumentId(TestData.EMPTY_PARAM);
    fileInfo.setTransientDocumentId(TestData.NULL_PARAM);

    // FileInfo with LibraryDocumentId empty
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(fileInfo,
                                                                                       ApiUtils.getAgreementName());
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_LIBRARYDOCUMENT_ID.getApiCode().equals(e.getApiCode()));
    }

    // Name null in documentCreationInfo
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(TestData.NULL_PARAM);

    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    // Redirect url set to empty in PostSignOptions, if specified.
    options.setRedirectUrl(TestData.EMPTY_PARAM);
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       options);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.EMPTY_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    // Redirect url set to empty in PostSignOptions, if specified.
    options.setRedirectUrl(TestData.INVALID_URL);
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       options);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_REDIRECT_URL.getApiCode().equals(e.getApiCode()));
    }

    // Redirect url set to empty in PostSignOptions, if specified.
    options.setRedirectUrl(TestData.REDIRECT_URL);
    options.setRedirectDelay(TestData.INVALID_REDIRECT_DELAY);
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       options);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_REDIRECT_DELAY.getApiCode().equals(e.getApiCode()));
    }

    // Both email and fax null in recipientInfo.
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       TestData.NULL_PARAM,
                                                                                       TestData.NULL_PARAM);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.MISSING_REQUIRED_PARAM.getApiCode().equals(e.getApiCode()));
    }

    // Wrong email set in recipientInfo.
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       TestData.INVALID_EMAIL,
                                                                                       TestData.NULL_PARAM);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_EMAIL.getApiCode().equals(e.getApiCode()));
    }

    // Both email and fax specified in recipientInfo
    agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName(),
                                                                                       TestData.POST_EMAIL,
                                                                                       TestData.POST_FAX);
    try {
      workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                           workflowId,
                                           agreementCreationRequest,
                                           TestData.X_API_HEADER);
    }
    catch (ApiException e) {
      assertTrue(e.getMessage(),
                 SdkErrorCodes.INVALID_ARGUMENTS.getApiCode().equals(e.getApiCode()));
    }

  }

  /**
   * Test for creating an agreement and sending it out for signature through the CreateWorkFlowAgreement endpoint.
   */
  @Test
  public void testCreateWorkflowAgreement() throws ApiException {
    CustomWorkflowAgreementCreationRequest agreementCreationRequest = WorkFlowUtils.getCustomWorkflowAgreementCreationRequest(ApiUtils.getAgreementName());

    try {
      AgreementCreationResponse response = workflowsApi.createWorkflowAgreement(TestData.ACCESS_TOKEN,
                                                                                workflowId,
                                                                                agreementCreationRequest,
                                                                                TestData.X_API_HEADER);
      assertNotNull(response);
      assertNotNull(response.getAgreementId());
    }
    catch (ApiException e) {
      fail(ApiUtils.getMessage(e));
    }
  }
}
