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

// typedef: security._types.Access

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.Access">API
 *      specification</a>
 */
@JsonpDeserializable
public class Access implements JsonpSerializable {
	private final List<ReplicationAccess> replication;

	private final List<SearchAccess> search;

	// ---------------------------------------------------------------------------------------------

	private Access(Builder builder) {

		this.replication = ApiTypeHelper.unmodifiable(builder.replication);
		this.search = ApiTypeHelper.unmodifiable(builder.search);

	}

	public static Access of(Function<Builder, ObjectBuilder<Access>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A list of indices permission entries for cross-cluster replication.
	 * <p>
	 * API name: {@code replication}
	 */
	public final List<ReplicationAccess> replication() {
		return this.replication;
	}

	/**
	 * A list of indices permission entries for cross-cluster search.
	 * <p>
	 * API name: {@code search}
	 */
	public final List<SearchAccess> search() {
		return this.search;
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

		if (ApiTypeHelper.isDefined(this.replication)) {
			generator.writeKey("replication");
			generator.writeStartArray();
			for (ReplicationAccess item0 : this.replication) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.search)) {
			generator.writeKey("search");
			generator.writeStartArray();
			for (SearchAccess item0 : this.search) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link Access}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Access> {
		@Nullable
		private List<ReplicationAccess> replication;

		@Nullable
		private List<SearchAccess> search;

		public Builder() {
		}
		private Builder(Access instance) {
			this.replication = instance.replication;
			this.search = instance.search;

		}
		/**
		 * A list of indices permission entries for cross-cluster replication.
		 * <p>
		 * API name: {@code replication}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>replication</code>.
		 */
		public final Builder replication(List<ReplicationAccess> list) {
			this.replication = _listAddAll(this.replication, list);
			return this;
		}

		/**
		 * A list of indices permission entries for cross-cluster replication.
		 * <p>
		 * API name: {@code replication}
		 * <p>
		 * Adds one or more values to <code>replication</code>.
		 */
		public final Builder replication(ReplicationAccess value, ReplicationAccess... values) {
			this.replication = _listAdd(this.replication, value, values);
			return this;
		}

		/**
		 * A list of indices permission entries for cross-cluster replication.
		 * <p>
		 * API name: {@code replication}
		 * <p>
		 * Adds a value to <code>replication</code> using a builder lambda.
		 */
		public final Builder replication(Function<ReplicationAccess.Builder, ObjectBuilder<ReplicationAccess>> fn) {
			return replication(fn.apply(new ReplicationAccess.Builder()).build());
		}

		/**
		 * A list of indices permission entries for cross-cluster search.
		 * <p>
		 * API name: {@code search}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>search</code>.
		 */
		public final Builder search(List<SearchAccess> list) {
			this.search = _listAddAll(this.search, list);
			return this;
		}

		/**
		 * A list of indices permission entries for cross-cluster search.
		 * <p>
		 * API name: {@code search}
		 * <p>
		 * Adds one or more values to <code>search</code>.
		 */
		public final Builder search(SearchAccess value, SearchAccess... values) {
			this.search = _listAdd(this.search, value, values);
			return this;
		}

		/**
		 * A list of indices permission entries for cross-cluster search.
		 * <p>
		 * API name: {@code search}
		 * <p>
		 * Adds a value to <code>search</code> using a builder lambda.
		 */
		public final Builder search(Function<SearchAccess.Builder, ObjectBuilder<SearchAccess>> fn) {
			return search(fn.apply(new SearchAccess.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Access}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Access build() {
			_checkSingleUse();

			return new Access(this);
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
	 * Json deserializer for {@link Access}
	 */
	public static final JsonpDeserializer<Access> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Access::setupAccessDeserializer);

	protected static void setupAccessDeserializer(ObjectDeserializer<Access.Builder> op) {

		op.add(Builder::replication, JsonpDeserializer.arrayDeserializer(ReplicationAccess._DESERIALIZER),
				"replication");
		op.add(Builder::search, JsonpDeserializer.arrayDeserializer(SearchAccess._DESERIALIZER), "search");

	}

}
