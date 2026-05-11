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
import java.util.List;
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

// typedef: security.bulk_update_api_keys.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.bulk_update_api_keys.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkUpdateApiKeysResponse implements JsonpSerializable {
	@Nullable
	private final BulkError errors;

	private final List<String> noops;

	private final List<String> updated;

	// ---------------------------------------------------------------------------------------------

	private BulkUpdateApiKeysResponse(Builder builder) {

		this.errors = builder.errors;
		this.noops = ApiTypeHelper.unmodifiableRequired(builder.noops, this, "noops");
		this.updated = ApiTypeHelper.unmodifiableRequired(builder.updated, this, "updated");

	}

	public static BulkUpdateApiKeysResponse of(Function<Builder, ObjectBuilder<BulkUpdateApiKeysResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code errors}
	 */
	@Nullable
	public final BulkError errors() {
		return this.errors;
	}

	/**
	 * Required - API name: {@code noops}
	 */
	public final List<String> noops() {
		return this.noops;
	}

	/**
	 * Required - API name: {@code updated}
	 */
	public final List<String> updated() {
		return this.updated;
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

		if (this.errors != null) {
			generator.writeKey("errors");
			this.errors.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.noops)) {
			generator.writeKey("noops");
			generator.writeStartArray();
			for (String item0 : this.noops) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.updated)) {
			generator.writeKey("updated");
			generator.writeStartArray();
			for (String item0 : this.updated) {
				generator.write(item0);

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
	 * Builder for {@link BulkUpdateApiKeysResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BulkUpdateApiKeysResponse> {
		@Nullable
		private BulkError errors;

		private List<String> noops;

		private List<String> updated;

		/**
		 * API name: {@code errors}
		 */
		public final Builder errors(@Nullable BulkError value) {
			this.errors = value;
			return this;
		}

		/**
		 * API name: {@code errors}
		 */
		public final Builder errors(Function<BulkError.Builder, ObjectBuilder<BulkError>> fn) {
			return this.errors(fn.apply(new BulkError.Builder()).build());
		}

		/**
		 * Required - API name: {@code noops}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>noops</code>.
		 */
		public final Builder noops(List<String> list) {
			this.noops = _listAddAll(this.noops, list);
			return this;
		}

		/**
		 * Required - API name: {@code noops}
		 * <p>
		 * Adds one or more values to <code>noops</code>.
		 */
		public final Builder noops(String value, String... values) {
			this.noops = _listAdd(this.noops, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code updated}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>updated</code>.
		 */
		public final Builder updated(List<String> list) {
			this.updated = _listAddAll(this.updated, list);
			return this;
		}

		/**
		 * Required - API name: {@code updated}
		 * <p>
		 * Adds one or more values to <code>updated</code>.
		 */
		public final Builder updated(String value, String... values) {
			this.updated = _listAdd(this.updated, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkUpdateApiKeysResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkUpdateApiKeysResponse build() {
			_checkSingleUse();

			return new BulkUpdateApiKeysResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkUpdateApiKeysResponse}
	 */
	public static final JsonpDeserializer<BulkUpdateApiKeysResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkUpdateApiKeysResponse::setupBulkUpdateApiKeysResponseDeserializer);

	protected static void setupBulkUpdateApiKeysResponseDeserializer(
			ObjectDeserializer<BulkUpdateApiKeysResponse.Builder> op) {

		op.add(Builder::errors, BulkError._DESERIALIZER, "errors");
		op.add(Builder::noops, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "noops");
		op.add(Builder::updated, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"updated");

	}

}
