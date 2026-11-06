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

package co.elastic.clients.elasticsearch.security.query_service_accounts;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch.security.get_service_accounts.UserManagedServiceAccount;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: security.query_service_accounts.QueryServiceAccount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_service_accounts.QueryServiceAccount">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryServiceAccount extends UserManagedServiceAccount {
	private final String username;

	private final List<FieldValue> sort;

	// ---------------------------------------------------------------------------------------------

	private QueryServiceAccount(Builder builder) {
		super(builder);

		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static QueryServiceAccount of(Function<Builder, ObjectBuilder<QueryServiceAccount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the service account, as
	 * <code>namespace/service</code>.
	 * <p>
	 * API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * The sort values of the service account, returned when the request has a
	 * <code>sort</code>.
	 * <p>
	 * API name: {@code _sort}
	 */
	public final List<FieldValue> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("username");
		generator.write(this.username);

		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("_sort");
			generator.writeStartArray();
			for (FieldValue item0 : this.sort) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryServiceAccount}.
	 */

	public static class Builder extends UserManagedServiceAccount.AbstractBuilder<Builder>
			implements
				ObjectBuilder<QueryServiceAccount> {
		private String username;

		@Nullable
		private List<FieldValue> sort;

		public Builder() {
		}
		private Builder(QueryServiceAccount instance) {
			super(instance);
			this.username = instance.username;
			this.sort = instance.sort;

		}
		/**
		 * Required - The name of the service account, as
		 * <code>namespace/service</code>.
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<FieldValue> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(FieldValue value, FieldValue... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(String value, String... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (String v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(long value, long... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (long v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(double value, double... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (double v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(boolean value, boolean... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (boolean v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * The sort values of the service account, returned when the request has a
		 * <code>sort</code>.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return sort(fn.apply(new FieldValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryServiceAccount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryServiceAccount build() {
			_checkSingleUse();

			return new QueryServiceAccount(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryServiceAccount}
	 */
	public static final JsonpDeserializer<QueryServiceAccount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryServiceAccount::setupQueryServiceAccountDeserializer);

	protected static void setupQueryServiceAccountDeserializer(ObjectDeserializer<QueryServiceAccount.Builder> op) {
		UserManagedServiceAccount.setupUserManagedServiceAccountDeserializer(op);
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "_sort");

	}

}
