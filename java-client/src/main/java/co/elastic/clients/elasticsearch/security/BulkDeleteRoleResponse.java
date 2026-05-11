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

// typedef: security.bulk_delete_role.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.bulk_delete_role.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkDeleteRoleResponse implements JsonpSerializable {
	private final List<String> deleted;

	private final List<String> notFound;

	@Nullable
	private final BulkError errors;

	// ---------------------------------------------------------------------------------------------

	private BulkDeleteRoleResponse(Builder builder) {

		this.deleted = ApiTypeHelper.unmodifiable(builder.deleted);
		this.notFound = ApiTypeHelper.unmodifiable(builder.notFound);
		this.errors = builder.errors;

	}

	public static BulkDeleteRoleResponse of(Function<Builder, ObjectBuilder<BulkDeleteRoleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Array of deleted roles
	 * <p>
	 * API name: {@code deleted}
	 */
	public final List<String> deleted() {
		return this.deleted;
	}

	/**
	 * Array of roles that could not be found
	 * <p>
	 * API name: {@code not_found}
	 */
	public final List<String> notFound() {
		return this.notFound;
	}

	/**
	 * Present if any deletes resulted in errors
	 * <p>
	 * API name: {@code errors}
	 */
	@Nullable
	public final BulkError errors() {
		return this.errors;
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

		if (ApiTypeHelper.isDefined(this.deleted)) {
			generator.writeKey("deleted");
			generator.writeStartArray();
			for (String item0 : this.deleted) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.notFound)) {
			generator.writeKey("not_found");
			generator.writeStartArray();
			for (String item0 : this.notFound) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.errors != null) {
			generator.writeKey("errors");
			this.errors.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkDeleteRoleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BulkDeleteRoleResponse> {
		@Nullable
		private List<String> deleted;

		@Nullable
		private List<String> notFound;

		@Nullable
		private BulkError errors;

		/**
		 * Array of deleted roles
		 * <p>
		 * API name: {@code deleted}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>deleted</code>.
		 */
		public final Builder deleted(List<String> list) {
			this.deleted = _listAddAll(this.deleted, list);
			return this;
		}

		/**
		 * Array of deleted roles
		 * <p>
		 * API name: {@code deleted}
		 * <p>
		 * Adds one or more values to <code>deleted</code>.
		 */
		public final Builder deleted(String value, String... values) {
			this.deleted = _listAdd(this.deleted, value, values);
			return this;
		}

		/**
		 * Array of roles that could not be found
		 * <p>
		 * API name: {@code not_found}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>notFound</code>.
		 */
		public final Builder notFound(List<String> list) {
			this.notFound = _listAddAll(this.notFound, list);
			return this;
		}

		/**
		 * Array of roles that could not be found
		 * <p>
		 * API name: {@code not_found}
		 * <p>
		 * Adds one or more values to <code>notFound</code>.
		 */
		public final Builder notFound(String value, String... values) {
			this.notFound = _listAdd(this.notFound, value, values);
			return this;
		}

		/**
		 * Present if any deletes resulted in errors
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(@Nullable BulkError value) {
			this.errors = value;
			return this;
		}

		/**
		 * Present if any deletes resulted in errors
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(Function<BulkError.Builder, ObjectBuilder<BulkError>> fn) {
			return this.errors(fn.apply(new BulkError.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkDeleteRoleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkDeleteRoleResponse build() {
			_checkSingleUse();

			return new BulkDeleteRoleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkDeleteRoleResponse}
	 */
	public static final JsonpDeserializer<BulkDeleteRoleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkDeleteRoleResponse::setupBulkDeleteRoleResponseDeserializer);

	protected static void setupBulkDeleteRoleResponseDeserializer(
			ObjectDeserializer<BulkDeleteRoleResponse.Builder> op) {

		op.add(Builder::deleted, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"deleted");
		op.add(Builder::notFound, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"not_found");
		op.add(Builder::errors, BulkError._DESERIALIZER, "errors");

	}

}
