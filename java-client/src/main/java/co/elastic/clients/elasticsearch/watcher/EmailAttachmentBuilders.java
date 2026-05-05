/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link EmailAttachment} variants.
 */
public class EmailAttachmentBuilders {
	private EmailAttachmentBuilders() {
	}

	/**
	 * Creates a builder for the {@link HttpEmailAttachment http}
	 * {@code EmailAttachment} variant.
	 */
	public static HttpEmailAttachment.Builder http() {
		return new HttpEmailAttachment.Builder();
	}

	/**
	 * Creates a EmailAttachment of the {@link HttpEmailAttachment http}
	 * {@code EmailAttachment} variant.
	 */
	public static EmailAttachment http(Function<HttpEmailAttachment.Builder, ObjectBuilder<HttpEmailAttachment>> fn) {
		EmailAttachment.Builder builder = new EmailAttachment.Builder();
		builder.http(fn.apply(new HttpEmailAttachment.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ReportingEmailAttachment reporting}
	 * {@code EmailAttachment} variant.
	 */
	public static ReportingEmailAttachment.Builder reporting() {
		return new ReportingEmailAttachment.Builder();
	}

	/**
	 * Creates a EmailAttachment of the {@link ReportingEmailAttachment reporting}
	 * {@code EmailAttachment} variant.
	 */
	public static EmailAttachment reporting(
			Function<ReportingEmailAttachment.Builder, ObjectBuilder<ReportingEmailAttachment>> fn) {
		EmailAttachment.Builder builder = new EmailAttachment.Builder();
		builder.reporting(fn.apply(new ReportingEmailAttachment.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataEmailAttachment data}
	 * {@code EmailAttachment} variant.
	 */
	public static DataEmailAttachment.Builder data() {
		return new DataEmailAttachment.Builder();
	}

	/**
	 * Creates a EmailAttachment of the {@link DataEmailAttachment data}
	 * {@code EmailAttachment} variant.
	 */
	public static EmailAttachment data(Function<DataEmailAttachment.Builder, ObjectBuilder<DataEmailAttachment>> fn) {
		EmailAttachment.Builder builder = new EmailAttachment.Builder();
		builder.data(fn.apply(new DataEmailAttachment.Builder()).build());
		return builder.build();
	}

}
