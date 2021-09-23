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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;

// typedef: _types.query_dsl.ShapeQuery
public final class ShapeQuery extends QueryBase implements Query {
	// ---------------------------------------------------------------------------------------------

	public ShapeQuery(Builder builder) {
		super(builder);

	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _type() {
		return "shape";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShapeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ShapeQuery> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShapeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShapeQuery build() {

			return new ShapeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<ShapeQuery.Builder, ShapeQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(ShapeQuery::setupShapeQueryDeserializer);

	protected static void setupShapeQueryDeserializer(DelegatingDeserializer<ShapeQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);

	}

}
