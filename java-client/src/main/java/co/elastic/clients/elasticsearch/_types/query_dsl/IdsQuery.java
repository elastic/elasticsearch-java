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
import co.elastic.clients.json.InstanceDeserializer;
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
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IdsQuery
public final class IdsQuery extends QueryBase implements Query {
	@Nullable
	private final List<String> values;

	// ---------------------------------------------------------------------------------------------

	public IdsQuery(Builder builder) {
		super(builder);

		this.values = builder.values;

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "ids";
	}

	/**
	 * API name: {@code values}
	 */
	@Nullable
	public List<String> values() {
		return this.values;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		super.serializeInternal(generator, mapper);
		if (this.values != null) {

			generator.writeKey("values");
			generator.writeStartArray();
			for (String item0 : this.values) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IdsQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<IdsQuery> {
		@Nullable
		private List<String> values;

		/**
		 * API name: {@code values}
		 */
		public Builder values(@Nullable List<String> value) {
			this.values = value;
			return this;
		}

		/**
		 * API name: {@code values}
		 */
		public Builder values(String... value) {
			this.values = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #values(List)}, creating the list if needed.
		 */
		public Builder addValues(String value) {
			if (this.values == null) {
				this.values = new ArrayList<>();
			}
			this.values.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IdsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IdsQuery build() {

			return new IdsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<IdsQuery.Builder, IdsQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(IdsQuery::setupIdsQueryDeserializer);

	protected static void setupIdsQueryDeserializer(DelegatingDeserializer<IdsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "values");

	}

}
