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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.remove_policy.Response
@JsonpDeserializable
public class RemovePolicyResponse implements JsonpSerializable {
	private final List<String> failedIndexes;

	private final boolean hasFailures;

	// ---------------------------------------------------------------------------------------------

	private RemovePolicyResponse(Builder builder) {

		this.failedIndexes = ModelTypeHelper.unmodifiableRequired(builder.failedIndexes, this, "failedIndexes");
		this.hasFailures = ModelTypeHelper.requireNonNull(builder.hasFailures, this, "hasFailures");

	}

	public static RemovePolicyResponse of(Function<Builder, ObjectBuilder<RemovePolicyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failed_indexes}
	 */
	public final List<String> failedIndexes() {
		return this.failedIndexes;
	}

	/**
	 * Required - API name: {@code has_failures}
	 */
	public final boolean hasFailures() {
		return this.hasFailures;
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

		if (ModelTypeHelper.isDefined(this.failedIndexes)) {
			generator.writeKey("failed_indexes");
			generator.writeStartArray();
			for (String item0 : this.failedIndexes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("has_failures");
		generator.write(this.hasFailures);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemovePolicyResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RemovePolicyResponse> {
		private List<String> failedIndexes;

		private Boolean hasFailures;

		/**
		 * Required - API name: {@code failed_indexes}
		 */
		public final Builder failedIndexes(List<String> value) {
			this.failedIndexes = value;
			return this;
		}

		/**
		 * Required - API name: {@code failed_indexes}
		 */
		public final Builder failedIndexes(String... value) {
			this.failedIndexes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code has_failures}
		 */
		public final Builder hasFailures(boolean value) {
			this.hasFailures = value;
			return this;
		}

		/**
		 * Builds a {@link RemovePolicyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemovePolicyResponse build() {
			_checkSingleUse();

			return new RemovePolicyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemovePolicyResponse}
	 */
	public static final JsonpDeserializer<RemovePolicyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemovePolicyResponse::setupRemovePolicyResponseDeserializer, Builder::build);

	protected static void setupRemovePolicyResponseDeserializer(
			DelegatingDeserializer<RemovePolicyResponse.Builder> op) {

		op.add(Builder::failedIndexes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"failed_indexes");
		op.add(Builder::hasFailures, JsonpDeserializer.booleanDeserializer(), "has_failures");

	}

}
