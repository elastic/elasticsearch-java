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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post_start_basic.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#license.post_start_basic.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostStartBasicResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final boolean basicWasStarted;

	@Nullable
	private final String errorMessage;

	@Nullable
	private final LicenseType type;

	private final Map<String, List<String>> acknowledge;

	// ---------------------------------------------------------------------------------------------

	private PostStartBasicResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.basicWasStarted = ApiTypeHelper.requireNonNull(builder.basicWasStarted, this, "basicWasStarted");
		this.errorMessage = builder.errorMessage;
		this.type = builder.type;
		this.acknowledge = ApiTypeHelper.unmodifiable(builder.acknowledge);

	}

	public static PostStartBasicResponse of(Function<Builder, ObjectBuilder<PostStartBasicResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code basic_was_started}
	 */
	public final boolean basicWasStarted() {
		return this.basicWasStarted;
	}

	/**
	 * API name: {@code error_message}
	 */
	@Nullable
	public final String errorMessage() {
		return this.errorMessage;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final LicenseType type() {
		return this.type;
	}

	/**
	 * API name: {@code acknowledge}
	 */
	public final Map<String, List<String>> acknowledge() {
		return this.acknowledge;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		generator.writeKey("basic_was_started");
		generator.write(this.basicWasStarted);

		if (this.errorMessage != null) {
			generator.writeKey("error_message");
			generator.write(this.errorMessage);

		}
		if (this.type != null) {
			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.acknowledge)) {
			generator.writeKey("acknowledge");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.acknowledge.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PostStartBasicResponse> {
		private Boolean acknowledged;

		private Boolean basicWasStarted;

		@Nullable
		private String errorMessage;

		@Nullable
		private LicenseType type;

		@Nullable
		private Map<String, List<String>> acknowledge;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code basic_was_started}
		 */
		public final Builder basicWasStarted(boolean value) {
			this.basicWasStarted = value;
			return this;
		}

		/**
		 * API name: {@code error_message}
		 */
		public final Builder errorMessage(@Nullable String value) {
			this.errorMessage = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable LicenseType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code acknowledge}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>acknowledge</code>.
		 */
		public final Builder acknowledge(Map<String, List<String>> map) {
			this.acknowledge = _mapPutAll(this.acknowledge, map);
			return this;
		}

		/**
		 * API name: {@code acknowledge}
		 * <p>
		 * Adds an entry to <code>acknowledge</code>.
		 */
		public final Builder acknowledge(String key, List<String> value) {
			this.acknowledge = _mapPut(this.acknowledge, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostStartBasicResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartBasicResponse build() {
			_checkSingleUse();

			return new PostStartBasicResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostStartBasicResponse}
	 */
	public static final JsonpDeserializer<PostStartBasicResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostStartBasicResponse::setupPostStartBasicResponseDeserializer);

	protected static void setupPostStartBasicResponseDeserializer(
			ObjectDeserializer<PostStartBasicResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::basicWasStarted, JsonpDeserializer.booleanDeserializer(), "basic_was_started");
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");
		op.add(Builder::type, LicenseType._DESERIALIZER, "type");
		op.add(Builder::acknowledge, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "acknowledge");

	}

}
