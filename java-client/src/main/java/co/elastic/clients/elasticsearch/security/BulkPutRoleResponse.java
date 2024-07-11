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

// typedef: security.bulk_put_role.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.bulk_put_role.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkPutRoleResponse implements JsonpSerializable {
	private final List<String> created;

	private final List<String> updated;

	private final List<String> noop;

	@Nullable
	private final BulkError errors;

	// ---------------------------------------------------------------------------------------------

	private BulkPutRoleResponse(Builder builder) {

		this.created = ApiTypeHelper.unmodifiable(builder.created);
		this.updated = ApiTypeHelper.unmodifiable(builder.updated);
		this.noop = ApiTypeHelper.unmodifiable(builder.noop);
		this.errors = builder.errors;

	}

	public static BulkPutRoleResponse of(Function<Builder, ObjectBuilder<BulkPutRoleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Array of created roles
	 * <p>
	 * API name: {@code created}
	 */
	public final List<String> created() {
		return this.created;
	}

	/**
	 * Array of updated roles
	 * <p>
	 * API name: {@code updated}
	 */
	public final List<String> updated() {
		return this.updated;
	}

	/**
	 * Array of role names without any changes
	 * <p>
	 * API name: {@code noop}
	 */
	public final List<String> noop() {
		return this.noop;
	}

	/**
	 * Present if any updates resulted in errors
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

		if (ApiTypeHelper.isDefined(this.created)) {
			generator.writeKey("created");
			generator.writeStartArray();
			for (String item0 : this.created) {
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
		if (ApiTypeHelper.isDefined(this.noop)) {
			generator.writeKey("noop");
			generator.writeStartArray();
			for (String item0 : this.noop) {
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
	 * Builder for {@link BulkPutRoleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<BulkPutRoleResponse> {
		@Nullable
		private List<String> created;

		@Nullable
		private List<String> updated;

		@Nullable
		private List<String> noop;

		@Nullable
		private BulkError errors;

		/**
		 * Array of created roles
		 * <p>
		 * API name: {@code created}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>created</code>.
		 */
		public final Builder created(List<String> list) {
			this.created = _listAddAll(this.created, list);
			return this;
		}

		/**
		 * Array of created roles
		 * <p>
		 * API name: {@code created}
		 * <p>
		 * Adds one or more values to <code>created</code>.
		 */
		public final Builder created(String value, String... values) {
			this.created = _listAdd(this.created, value, values);
			return this;
		}

		/**
		 * Array of updated roles
		 * <p>
		 * API name: {@code updated}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>updated</code>.
		 */
		public final Builder updated(List<String> list) {
			this.updated = _listAddAll(this.updated, list);
			return this;
		}

		/**
		 * Array of updated roles
		 * <p>
		 * API name: {@code updated}
		 * <p>
		 * Adds one or more values to <code>updated</code>.
		 */
		public final Builder updated(String value, String... values) {
			this.updated = _listAdd(this.updated, value, values);
			return this;
		}

		/**
		 * Array of role names without any changes
		 * <p>
		 * API name: {@code noop}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>noop</code>.
		 */
		public final Builder noop(List<String> list) {
			this.noop = _listAddAll(this.noop, list);
			return this;
		}

		/**
		 * Array of role names without any changes
		 * <p>
		 * API name: {@code noop}
		 * <p>
		 * Adds one or more values to <code>noop</code>.
		 */
		public final Builder noop(String value, String... values) {
			this.noop = _listAdd(this.noop, value, values);
			return this;
		}

		/**
		 * Present if any updates resulted in errors
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(@Nullable BulkError value) {
			this.errors = value;
			return this;
		}

		/**
		 * Present if any updates resulted in errors
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
		 * Builds a {@link BulkPutRoleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkPutRoleResponse build() {
			_checkSingleUse();

			return new BulkPutRoleResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkPutRoleResponse}
	 */
	public static final JsonpDeserializer<BulkPutRoleResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkPutRoleResponse::setupBulkPutRoleResponseDeserializer);

	protected static void setupBulkPutRoleResponseDeserializer(ObjectDeserializer<BulkPutRoleResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"created");
		op.add(Builder::updated, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"updated");
		op.add(Builder::noop, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "noop");
		op.add(Builder::errors, BulkError._DESERIALIZER, "errors");

	}

}
