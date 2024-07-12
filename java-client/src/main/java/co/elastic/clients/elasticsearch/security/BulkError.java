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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
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

// typedef: security._types.BulkError

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.BulkError">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkError implements JsonpSerializable {
	private final int count;

	private final Map<String, ErrorCause> details;

	// ---------------------------------------------------------------------------------------------

	private BulkError(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.details = ApiTypeHelper.unmodifiableRequired(builder.details, this, "details");

	}

	public static BulkError of(Function<Builder, ObjectBuilder<BulkError>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of errors
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - Details about the errors, keyed by role name
	 * <p>
	 * API name: {@code details}
	 */
	public final Map<String, ErrorCause> details() {
		return this.details;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.details)) {
			generator.writeKey("details");
			generator.writeStartObject();
			for (Map.Entry<String, ErrorCause> item0 : this.details.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
	 * Builder for {@link BulkError}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BulkError> {
		private Integer count;

		private Map<String, ErrorCause> details;

		/**
		 * Required - The number of errors
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Details about the errors, keyed by role name
		 * <p>
		 * API name: {@code details}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>details</code>.
		 */
		public final Builder details(Map<String, ErrorCause> map) {
			this.details = _mapPutAll(this.details, map);
			return this;
		}

		/**
		 * Required - Details about the errors, keyed by role name
		 * <p>
		 * API name: {@code details}
		 * <p>
		 * Adds an entry to <code>details</code>.
		 */
		public final Builder details(String key, ErrorCause value) {
			this.details = _mapPut(this.details, key, value);
			return this;
		}

		/**
		 * Required - Details about the errors, keyed by role name
		 * <p>
		 * API name: {@code details}
		 * <p>
		 * Adds an entry to <code>details</code> using a builder lambda.
		 */
		public final Builder details(String key, Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return details(key, fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkError}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkError build() {
			_checkSingleUse();

			return new BulkError(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkError}
	 */
	public static final JsonpDeserializer<BulkError> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BulkError::setupBulkErrorDeserializer);

	protected static void setupBulkErrorDeserializer(ObjectDeserializer<BulkError.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::details, JsonpDeserializer.stringMapDeserializer(ErrorCause._DESERIALIZER), "details");

	}

}
