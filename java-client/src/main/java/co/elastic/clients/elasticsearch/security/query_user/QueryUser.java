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

package co.elastic.clients.elasticsearch.security.query_user;

import co.elastic.clients.elasticsearch._types.FieldValue;
import co.elastic.clients.elasticsearch.security.User;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
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

// typedef: security.query_user.QueryUser

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_user.QueryUser">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryUser extends User {
	private final List<FieldValue> sort;

	// ---------------------------------------------------------------------------------------------

	private QueryUser(Builder builder) {
		super(builder);

		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static QueryUser of(Function<Builder, ObjectBuilder<QueryUser>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code _sort}
	 */
	public final List<FieldValue> sort() {
		return this.sort;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
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
	 * Builder for {@link QueryUser}.
	 */

	public static class Builder extends User.AbstractBuilder<Builder> implements ObjectBuilder<QueryUser> {
		@Nullable
		private List<FieldValue> sort;

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<FieldValue> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(FieldValue value, FieldValue... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds all passed values to <code>sort</code>.
		 */
		public final Builder sort(String value, String... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (String v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.sort = _listAddAll(this.sort, fieldValues);
			return this;
		}

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds all passed values to <code>sort</code>.
		 */
		public final Builder sort(long value, long... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (long v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.sort = _listAddAll(this.sort, fieldValues);
			return this;
		}

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds all passed values to <code>sort</code>.
		 */
		public final Builder sort(double value, double... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (double v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.sort = _listAddAll(this.sort, fieldValues);
			return this;
		}

		/**
		 * API name: {@code _sort}
		 * <p>
		 * Adds all passed values to <code>sort</code>.
		 */
		public final Builder sort(boolean value, boolean... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			List<FieldValue> fieldValues = new ArrayList<>();
			for (boolean v : values) {
				fieldValues.add(FieldValue.of(v));
			}
			this.sort = _listAddAll(this.sort, fieldValues);
			return this;
		}

		/**
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
		 * Builds a {@link QueryUser}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryUser build() {
			_checkSingleUse();

			return new QueryUser(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryUser}
	 */
	public static final JsonpDeserializer<QueryUser> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryUser::setupQueryUserDeserializer);

	protected static void setupQueryUserDeserializer(ObjectDeserializer<QueryUser.Builder> op) {
		User.setupUserDeserializer(op);
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "_sort");

	}

}
