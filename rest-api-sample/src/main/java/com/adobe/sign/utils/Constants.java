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
package com.adobe.sign.utils;

import java.util.Date;
import java.util.Properties;

public class Constants {

  private static final String CONFIG_PATH = "src/main/java/com/adobe/sign/resources/config.properties";
  private static Properties properties= ApiUtils.getProperties(CONFIG_PATH);
  private static final String MINUS_ONE = "-1";
  private static final String ACCESS_TOKEN_KEY= "accessToken";

  private static final String X_API_USER_KEY = "xApiUser";
  private static final String USER_FIRST_NAME_KEY = "userFirstName";
  private static final String USER_LAST_NAME_KEY = "userLastName";
  private static final String USER_EMAIL_KEY = "userEmail";
  private static final String X_USER_EMAIL_KEY = "xUserEmail";
  private static final String ALTERNATE_PARTICIPANT_EMAIL_KEY = "alternateParticipantEmail";
  private static final String GROUP_NAME_KEY = "groupName";

  private static final String AGREEMENT_NAME_KEY = "agreementName";

  private static final String ALTERNATE_PARTICIPANT_MESSAGE_KEY = "alternateParticipantMessage";
  private static final String EXTERNAL_ID_KEY = "externalID";
  private static final String EXTERNAL_GROUP_KEY = "externalGroup";
  private static final String EXTERNAL_NAMESPACE_KEY = "externalNamespace";
  private static final String QUERY_KEY = "query";
  private static final String MEGA_SIGN_NAME = "megaSignName";
  private static final String WIDGET_NAME_KEY = "widgetName";

  private static final String FILE_SEP = "/";
  private static final String INPUT_FILE_NAME_KEY = "inputFileName";
  private static final String REQUEST_PATH_KEY = "requestPath";
  private static final String OUTPUT_PATH_KEY = "outputPath";

  private static final String AGREEMENT_DOCUMENT_KEY = "agreementDocument";
  private static final String ARCHIVE_KEY = "archive";
  private static final String AUDIT_TRAIL_KEY = "auditTrail";
  private static final String FORM_DATA_KEY = "formData";

  private static final String MIME_TYPE_PDF_KEY = "mimeTypePdf";
  private static final String WAITING_DAYS_KEY = "waitingDays";
  private static final String DAYS_BEFORE_CURRENT_DATE_KEY = "daysBeforeCurrentDate";

  private static final String MAX_EVENTS_SIZE_KEY = "maxEventsSize";
  private static final String FILE_OFFSET_KEY = "fileOffset";
  private static final String PAGE_SIZE_KEY = "pageSize";
  private static final String INPUT_FORM_FIELD_FILE_NAME_KEY = "inputFormFieldFileName";

  //Common Parameters
  public static final String ACCESS_TOKEN = properties.getProperty(ACCESS_TOKEN_KEY).equals("null") ? null : properties.getProperty(ACCESS_TOKEN_KEY);
  public static final String X_API_USER = properties.getProperty(X_API_USER_KEY).equals("null") ? null : properties.getProperty(X_API_USER_KEY);
  public static final String USER_FIRST_NAME = properties.getProperty(USER_FIRST_NAME_KEY).equals("null") ? null : properties.getProperty(USER_FIRST_NAME_KEY);
  public static final String USER_LAST_NAME = properties.getProperty(USER_LAST_NAME_KEY).equals("null") ? null : properties.getProperty(USER_LAST_NAME_KEY);
  public static final String USER_EMAIL = properties.getProperty(USER_EMAIL_KEY).equals("null") ? null : properties.getProperty(USER_EMAIL_KEY);
  public static final String X_USER_EMAIL = properties.getProperty(X_USER_EMAIL_KEY).equals("null") ? null : properties.getProperty(X_USER_EMAIL_KEY);
  public static final String ALTERNATE_PARTICIPANT_EMAIL = properties.getProperty(ALTERNATE_PARTICIPANT_EMAIL_KEY).equals("null") ? null : properties.getProperty(ALTERNATE_PARTICIPANT_EMAIL_KEY);
  public static final String GROUP_NAME = ApiUtils.getGroupName(properties.getProperty(GROUP_NAME_KEY).equals("null") ? null : properties.getProperty(GROUP_NAME_KEY));
  public static final String AGREEMENT_NAME = ApiUtils.getAgreementName(properties.getProperty(AGREEMENT_NAME_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_NAME_KEY));
  public static final String MEGASIGN_NAME = ApiUtils.getMegaSignName(properties.getProperty(MEGA_SIGN_NAME).equals("null") ? null : properties.getProperty(MEGA_SIGN_NAME));
  public static final String WIDGET_NAME = ApiUtils.getWidgetName(properties.getProperty(WIDGET_NAME_KEY).equals("null") ? null : properties.getProperty(WIDGET_NAME_KEY));
  public static final String ALTERNATE_PARTICIPANT_MESSAGE = properties.getProperty(ALTERNATE_PARTICIPANT_MESSAGE_KEY).equals("null") ? null : properties.getProperty(ALTERNATE_PARTICIPANT_MESSAGE_KEY);
  public static final String EXTERNAL_ID = properties.getProperty(EXTERNAL_ID_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_ID_KEY);
  public static final String EXTERNAL_GROUP = properties.getProperty(EXTERNAL_GROUP_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_GROUP_KEY);
  public static final String EXTERNAL_NAMESPACE = properties.getProperty(EXTERNAL_NAMESPACE_KEY).equals("null") ? null : properties.getProperty(EXTERNAL_NAMESPACE_KEY);
  public static final String QUERY = properties.getProperty(QUERY_KEY).equals("null") ? null : properties.getProperty(QUERY_KEY);
  public static final String INPUT_FILE_NAME = properties.getProperty(INPUT_FILE_NAME_KEY).equals("null") ? null : properties.getProperty(INPUT_FILE_NAME_KEY);
  public static final String REQUEST_PATH = properties.getProperty(REQUEST_PATH_KEY).equals("null") ? null : properties.getProperty(REQUEST_PATH_KEY) + FILE_SEP;
  public static final String OUTPUT_PATH = properties.getProperty(OUTPUT_PATH_KEY).equals("null") ? null : properties.getProperty(OUTPUT_PATH_KEY) + FILE_SEP;
  public static final String AGREEMENT_DOCUMENT = properties.getProperty(AGREEMENT_DOCUMENT_KEY).equals("null") ? null : properties.getProperty(AGREEMENT_DOCUMENT_KEY) + FILE_SEP;
  public static final String ARCHIVE = properties.getProperty(ARCHIVE_KEY).equals("null") ? null : properties.getProperty(ARCHIVE_KEY) + FILE_SEP;
  public static final String AUDIT_TRAIL = properties.getProperty(AUDIT_TRAIL_KEY).equals("null") ? null : properties.getProperty(AUDIT_TRAIL_KEY) + FILE_SEP;
  public static final String FORM_DATA = properties.getProperty(FORM_DATA_KEY).equals("null") ? null : properties.getProperty(FORM_DATA_KEY) + FILE_SEP;
  public static final String MIME_TYPE_PDF = properties.getProperty(MIME_TYPE_PDF_KEY).equals("null") ? null : properties.getProperty(MIME_TYPE_PDF_KEY);
  public static final int MILLISECS_PER_DAY = ApiUtils.getMilliSecsPerDay();
  public static final int WAITING_DAYS = Integer.parseInt(properties.getProperty(WAITING_DAYS_KEY).equals("null") ? MINUS_ONE : properties.getProperty(WAITING_DAYS_KEY));
  public static final int WAITING_TIME_LIMIT = WAITING_DAYS * MILLISECS_PER_DAY;
  public static final int DAYS_BEFORE_CURRENT_DATE = Integer.parseInt(properties.getProperty(DAYS_BEFORE_CURRENT_DATE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(DAYS_BEFORE_CURRENT_DATE_KEY));
  public static final Date START_DATE = ApiUtils.getStartDate();
  public static final Date END_DATE = ApiUtils.getEndDate();
  public static final int MAX_EVENTS_SIZE = Integer.parseInt(properties.getProperty(MAX_EVENTS_SIZE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(MAX_EVENTS_SIZE_KEY));
  public static final int FILE_OFFSET = Integer.parseInt(properties.getProperty(FILE_OFFSET_KEY).equals("null") ? MINUS_ONE : properties.getProperty(FILE_OFFSET_KEY));
  public static final int PAGE_SIZE = Integer.parseInt(properties.getProperty(PAGE_SIZE_KEY).equals("null") ? MINUS_ONE : properties.getProperty(PAGE_SIZE_KEY));
  public static final String INPUT_FORM_FIELD_FILE_NAME = properties.getProperty(INPUT_FORM_FIELD_FILE_NAME_KEY).equals("null") ? null : properties.getProperty(INPUT_FORM_FIELD_FILE_NAME_KEY);
}
