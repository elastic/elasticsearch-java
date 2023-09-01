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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform._types.RetentionPolicy

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform._types.RetentionPolicy">API
 *      specification</a>
 */
@JsonpDeserializable
public class TimeRetentionPolicy implements RetentionPolicyVariant, JsonpSerializable {
	private final String field;

	private final Time maxAge;

	// ---------------------------------------------------------------------------------------------

	private TimeRetentionPolicy(Builder builder) {

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.maxAge = ApiTypeHelper.requireNonNull(builder.maxAge, this, "maxAge");

	}

	public static TimeRetentionPolicy of(Function<Builder, ObjectBuilder<TimeRetentionPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * RetentionPolicy variant kind.
	 */
	@Override
	public RetentionPolicy.Kind _retentionPolicyKind() {
		return RetentionPolicy.Kind.Time;
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
	public final Time maxAge() {
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
		this.maxAge.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeRetentionPolicy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TimeRetentionPolicy> {
		private String field;

		private Time maxAge;

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
		public final Builder maxAge(Time value) {
			this.maxAge = value;
			return this;
		}

		/**
		 * Required - Specifies the maximum age of a document in the destination index.
		 * Documents that are older than the configured value are removed from the
		 * destination index.
		 * <p>
		 * API name: {@code max_age}
		 */
		public final Builder maxAge(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxAge(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			.lazy(Builder::new, TimeRetentionPolicy::setupTimeRetentionPolicyDeserializer);

	protected static void setupTimeRetentionPolicyDeserializer(ObjectDeserializer<TimeRetentionPolicy.Builder> op) {

		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::maxAge, Time._DESERIALIZER, "max_age");

	}

}
