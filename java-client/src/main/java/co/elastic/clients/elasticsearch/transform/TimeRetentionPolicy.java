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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform._types.RetentionPolicy
@JsonpDeserializable
public final class TimeRetentionPolicy implements RetentionPolicyVariant, JsonpSerializable {
	private final String field;

	private final String maxAge;

	// ---------------------------------------------------------------------------------------------

	public TimeRetentionPolicy(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.maxAge = Objects.requireNonNull(builder.maxAge, "max_age");

	}

	/**
	 * {@link RetentionPolicy} variant type
	 */
	@Override
	public String _variantType() {
		return "time";
	}

	/**
	 * The date field that is used to calculate the age of the document.
	 * <p>
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * Specifies the maximum age of a document in the destination index. Documents
	 * that are older than the configured value are removed from the destination
	 * index.
	 * <p>
	 * API name: {@code max_age}
	 */
	public String maxAge() {
		return this.maxAge;
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

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("max_age");
		generator.write(this.maxAge);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeRetentionPolicy}.
	 */
	public static class Builder implements ObjectBuilder<TimeRetentionPolicy> {
		private String field;

		private String maxAge;

		/**
		 * The date field that is used to calculate the age of the document.
		 * <p>
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Specifies the maximum age of a document in the destination index. Documents
		 * that are older than the configured value are removed from the destination
		 * index.
		 * <p>
		 * API name: {@code max_age}
		 */
		public Builder maxAge(String value) {
			this.maxAge = value;
			return this;
		}

		/**
		 * Builds a {@link TimeRetentionPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeRetentionPolicy build() {

			return new TimeRetentionPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeRetentionPolicy}
	 */
	public static final JsonpDeserializer<TimeRetentionPolicy> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TimeRetentionPolicy::setupTimeRetentionPolicyDeserializer, Builder::build);

	protected static void setupTimeRetentionPolicyDeserializer(DelegatingDeserializer<TimeRetentionPolicy.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxAge, JsonpDeserializer.stringDeserializer(), "max_age");

	}

}
