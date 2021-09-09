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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.PinnedQuery
public final class PinnedQuery extends QueryBase {
	private final List<String> ids;

	private final QueryContainer organic;

	// ---------------------------------------------------------------------------------------------

	protected PinnedQuery(Builder builder) {
		super(builder);
		this.ids = Objects.requireNonNull(builder.ids, "ids");
		this.organic = Objects.requireNonNull(builder.organic, "organic");

	}

	/**
	 * API name: {@code ids}
	 */
	public List<String> ids() {
		return this.ids;
	}

	/**
	 * API name: {@code organic}
	 */
	public QueryContainer organic() {
		return this.organic;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("ids");
		generator.writeStartArray();
		for (String item0 : this.ids) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("organic");
		this.organic.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PinnedQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<PinnedQuery> {
		private List<String> ids;

		private QueryContainer organic;

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ids(List)}, creating the list if needed.
		 */
		public Builder addIds(String value) {
			if (this.ids == null) {
				this.ids = new ArrayList<>();
			}
			this.ids.add(value);
			return this;
		}

		/**
		 * API name: {@code organic}
		 */
		public Builder organic(QueryContainer value) {
			this.organic = value;
			return this;
		}

		/**
		 * API name: {@code organic}
		 */
		public Builder organic(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.organic(fn.apply(new QueryContainer.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PinnedQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PinnedQuery build() {

			return new PinnedQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PinnedQuery
	 */
	public static final JsonpDeserializer<PinnedQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PinnedQuery::setupPinnedQueryDeserializer);

	protected static void setupPinnedQueryDeserializer(DelegatingDeserializer<PinnedQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::organic, QueryContainer.DESERIALIZER, "organic");

	}

}
