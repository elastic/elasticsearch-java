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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.RetentionPolicy
@JsonpDeserializable
public class TimeRetentionPolicy implements RetentionPolicyVariant, JsonpSerializable {
	private final String field;

	private final String maxAge;

	// ---------------------------------------------------------------------------------------------

	private TimeRetentionPolicy(Builder builder) {

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.maxAge = ModelTypeHelper.requireNonNull(builder.maxAge, this, "maxAge");

	}

	public static TimeRetentionPolicy of(Function<Builder, ObjectBuilder<TimeRetentionPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link RetentionPolicy} variant type
	 */
	@Override
	public String _variantType() {
		return "time";
	}

	/**
	 * Required - The date field that is used to calculate the age of the document.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - Specifies the maximum age of a document in the destination index.
	 * Documents that are older than the configured value are removed from the
	 * destination index.
	 * <p>
	 * API name: {@code max_age}
	 */
	public final String maxAge() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TimeRetentionPolicy> {
		private String field;

		private String maxAge;

		/**
		 * Required - The date field that is used to calculate the age of the document.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - Specifies the maximum age of a document in the destination index.
		 * Documents that are older than the configured value are removed from the
		 * destination index.
		 * <p>
		 * API name: {@code max_age}
		 */
		public final Builder maxAge(String value) {
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
			_checkSingleUse();

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
