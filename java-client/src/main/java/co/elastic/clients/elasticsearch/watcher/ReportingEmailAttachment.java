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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: watcher._types.ReportingEmailAttachment

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ReportingEmailAttachment">API
 *      specification</a>
 */
@JsonpDeserializable
public class ReportingEmailAttachment implements EmailAttachmentVariant, JsonpSerializable {
	private final String url;

	@Nullable
	private final Boolean inline;

	@Nullable
	private final Integer retries;

	@Nullable
	private final Time interval;

	@Nullable
	private final HttpInputRequestDefinition request;

	// ---------------------------------------------------------------------------------------------

	private ReportingEmailAttachment(Builder builder) {

		this.url = ApiTypeHelper.requireNonNull(builder.url, this, "url");
		this.inline = builder.inline;
		this.retries = builder.retries;
		this.interval = builder.interval;
		this.request = builder.request;

	}

	public static ReportingEmailAttachment of(Function<Builder, ObjectBuilder<ReportingEmailAttachment>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * EmailAttachment variant kind.
	 */
	@Override
	public EmailAttachment.Kind _emailAttachmentKind() {
		return EmailAttachment.Kind.Reporting;
	}

	/**
	 * Required - API name: {@code url}
	 */
	public final String url() {
		return this.url;
	}

	/**
	 * API name: {@code inline}
	 */
	@Nullable
	public final Boolean inline() {
		return this.inline;
	}

	/**
	 * API name: {@code retries}
	 */
	@Nullable
	public final Integer retries() {
		return this.retries;
	}

	/**
	 * API name: {@code interval}
	 */
	@Nullable
	public final Time interval() {
		return this.interval;
	}

	/**
	 * API name: {@code request}
	 */
	@Nullable
	public final HttpInputRequestDefinition request() {
		return this.request;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("url");
		generator.write(this.url);

		if (this.inline != null) {
			generator.writeKey("inline");
			generator.write(this.inline);

		}
		if (this.retries != null) {
			generator.writeKey("retries");
			generator.write(this.retries);

		}
		if (this.interval != null) {
			generator.writeKey("interval");
			this.interval.serialize(generator, mapper);

		}
		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReportingEmailAttachment}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ReportingEmailAttachment> {
		private String url;

		@Nullable
		private Boolean inline;

		@Nullable
		private Integer retries;

		@Nullable
		private Time interval;

		@Nullable
		private HttpInputRequestDefinition request;

		/**
		 * Required - API name: {@code url}
		 */
		public final Builder url(String value) {
			this.url = value;
			return this;
		}

		/**
		 * API name: {@code inline}
		 */
		public final Builder inline(@Nullable Boolean value) {
			this.inline = value;
			return this;
		}

		/**
		 * API name: {@code retries}
		 */
		public final Builder retries(@Nullable Integer value) {
			this.retries = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable Time value) {
			this.interval = value;
			return this;
		}

		/**
		 * API name: {@code interval}
		 */
		public final Builder interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable HttpInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestDefinition.Builder, ObjectBuilder<HttpInputRequestDefinition>> fn) {
			return this.request(fn.apply(new HttpInputRequestDefinition.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ReportingEmailAttachment}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReportingEmailAttachment build() {
			_checkSingleUse();

			return new ReportingEmailAttachment(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReportingEmailAttachment}
	 */
	public static final JsonpDeserializer<ReportingEmailAttachment> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ReportingEmailAttachment::setupReportingEmailAttachmentDeserializer);

	protected static void setupReportingEmailAttachmentDeserializer(
			ObjectDeserializer<ReportingEmailAttachment.Builder> op) {

		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");
		op.add(Builder::inline, JsonpDeserializer.booleanDeserializer(), "inline");
		op.add(Builder::retries, JsonpDeserializer.integerDeserializer(), "retries");
		op.add(Builder::interval, Time._DESERIALIZER, "interval");
		op.add(Builder::request, HttpInputRequestDefinition._DESERIALIZER, "request");

	}

}
