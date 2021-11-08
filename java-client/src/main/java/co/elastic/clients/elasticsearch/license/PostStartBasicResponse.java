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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post_start_basic.Response
@JsonpDeserializable
public class PostStartBasicResponse extends AcknowledgedResponseBase {
	private final Map<String, List<String>> acknowledge;

	private final boolean basicWasStarted;

	private final String errorMessage;

	// ---------------------------------------------------------------------------------------------

	private PostStartBasicResponse(Builder builder) {
		super(builder);

		this.acknowledge = ModelTypeHelper.unmodifiableRequired(builder.acknowledge, this, "acknowledge");
		this.basicWasStarted = ModelTypeHelper.requireNonNull(builder.basicWasStarted, this, "basicWasStarted");
		this.errorMessage = ModelTypeHelper.requireNonNull(builder.errorMessage, this, "errorMessage");

	}

	public static PostStartBasicResponse of(Function<Builder, ObjectBuilder<PostStartBasicResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledge}
	 */
	public final Map<String, List<String>> acknowledge() {
		return this.acknowledge;
	}

	/**
	 * Required - API name: {@code basic_was_started}
	 */
	public final boolean basicWasStarted() {
		return this.basicWasStarted;
	}

	/**
	 * Required - API name: {@code error_message}
	 */
	public final String errorMessage() {
		return this.errorMessage;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.acknowledge)) {
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
		generator.writeKey("basic_was_started");
		generator.write(this.basicWasStarted);

		generator.writeKey("error_message");
		generator.write(this.errorMessage);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostStartBasicResponse> {
		private Map<String, List<String>> acknowledge;

		private Boolean basicWasStarted;

		private String errorMessage;

		/**
		 * Required - API name: {@code acknowledge}
		 */
		public final Builder acknowledge(Map<String, List<String>> value) {
			this.acknowledge = value;
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
		 * Required - API name: {@code error_message}
		 */
		public final Builder errorMessage(String value) {
			this.errorMessage = value;
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
			.lazy(Builder::new, PostStartBasicResponse::setupPostStartBasicResponseDeserializer, Builder::build);

	protected static void setupPostStartBasicResponseDeserializer(
			DelegatingDeserializer<PostStartBasicResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::acknowledge, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "acknowledge");
		op.add(Builder::basicWasStarted, JsonpDeserializer.booleanDeserializer(), "basic_was_started");
		op.add(Builder::errorMessage, JsonpDeserializer.stringDeserializer(), "error_message");

	}

}
