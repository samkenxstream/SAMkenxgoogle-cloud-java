/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.certificatemanager.v1.samples;

// [START
// certificatemanager_v1_generated_certificatemanagerclient_listcertificatemapentries_paged_async]
import com.google.cloud.certificatemanager.v1.CertificateManagerClient;
import com.google.cloud.certificatemanager.v1.CertificateMapEntry;
import com.google.cloud.certificatemanager.v1.CertificateMapName;
import com.google.cloud.certificatemanager.v1.ListCertificateMapEntriesRequest;
import com.google.cloud.certificatemanager.v1.ListCertificateMapEntriesResponse;
import com.google.common.base.Strings;

public class AsyncListCertificateMapEntriesPaged {

  public static void main(String[] args) throws Exception {
    asyncListCertificateMapEntriesPaged();
  }

  public static void asyncListCertificateMapEntriesPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateManagerClient certificateManagerClient = CertificateManagerClient.create()) {
      ListCertificateMapEntriesRequest request =
          ListCertificateMapEntriesRequest.newBuilder()
              .setParent(
                  CertificateMapName.of("[PROJECT]", "[LOCATION]", "[CERTIFICATE_MAP]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListCertificateMapEntriesResponse response =
            certificateManagerClient.listCertificateMapEntriesCallable().call(request);
        for (CertificateMapEntry element : response.getCertificateMapEntriesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END
// certificatemanager_v1_generated_certificatemanagerclient_listcertificatemapentries_paged_async]
