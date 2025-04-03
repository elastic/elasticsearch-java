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

// typedef: watcher._types.PagerDutyResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.PagerDutyResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class PagerDutyResult implements JsonpSerializable {
	private final PagerDutyEvent event;

	@Nullable
	private final String reason;

	@Nullable
	private final HttpInputRequestResult request;

	@Nullable
	private final HttpInputResponseResult response;

	// ---------------------------------------------------------------------------------------------

	private PagerDutyResult(Builder builder) {

		this.event = ApiTypeHelper.requireNonNull(builder.event, this, "event");
		this.reason = builder.reason;
		this.request = builder.request;
		this.response = builder.response;

	}

	public static PagerDutyResult of(Function<Builder, ObjectBuilder<PagerDutyResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code event}
	 */
	public final PagerDutyEvent event() {
		return this.event;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code request}
	 */
	@Nullable
	public final HttpInputRequestResult request() {
		return this.request;
	}

	/**
	 * API name: {@code response}
	 */
	@Nullable
	public final HttpInputResponseResult response() {
		return this.response;
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

		generator.writeKey("event");
		this.event.serialize(generator, mapper);

		if (this.reason != null) {
			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (this.request != null) {
			generator.writeKey("request");
			this.request.serialize(generator, mapper);

		}
		if (this.response != null) {
			generator.writeKey("response");
			this.response.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PagerDutyResult> {
		private PagerDutyEvent event;

		@Nullable
		private String reason;

		@Nullable
		private HttpInputRequestResult request;

		@Nullable
		private HttpInputResponseResult response;

		/**
		 * Required - API name: {@code event}
		 */
		public final Builder event(PagerDutyEvent value) {
			this.event = value;
			return this;
		}

		/**
		 * Required - API name: {@code event}
		 */
		public final Builder event(Function<PagerDutyEvent.Builder, ObjectBuilder<PagerDutyEvent>> fn) {
			return this.event(fn.apply(new PagerDutyEvent.Builder()).build());
		}

		/**
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable HttpInputRequestResult value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public final Builder request(
				Function<HttpInputRequestResult.Builder, ObjectBuilder<HttpInputRequestResult>> fn) {
			return this.request(fn.apply(new HttpInputRequestResult.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public final Builder response(@Nullable HttpInputResponseResult value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public final Builder response(
				Function<HttpInputResponseResult.Builder, ObjectBuilder<HttpInputResponseResult>> fn) {
			return this.response(fn.apply(new HttpInputResponseResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PagerDutyResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyResult build() {
			_checkSingleUse();

			return new PagerDutyResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyResult}
	 */
	public static final JsonpDeserializer<PagerDutyResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyResult::setupPagerDutyResultDeserializer);

	protected static void setupPagerDutyResultDeserializer(ObjectDeserializer<PagerDutyResult.Builder> op) {

		op.add(Builder::event, PagerDutyEvent._DESERIALIZER, "event");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::request, HttpInputRequestResult._DESERIALIZER, "request");
		op.add(Builder::response, HttpInputResponseResult._DESERIALIZER, "response");

	}

}
