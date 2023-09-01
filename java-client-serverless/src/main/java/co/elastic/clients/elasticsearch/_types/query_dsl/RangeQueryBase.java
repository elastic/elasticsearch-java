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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RangeQueryBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RangeQueryBase">API
 *      specification</a>
 */

public abstract class RangeQueryBase extends QueryBase {
	@Nullable
	private final RangeRelation relation;

	// ---------------------------------------------------------------------------------------------

	protected RangeQueryBase(AbstractBuilder<?> builder) {
		super(builder);

		this.relation = builder.relation;

	}

	/**
	 * Indicates how the range query matches values for <code>range</code> fields.
	 * <p>
	 * API name: {@code relation}
	 */
	@Nullable
	public final RangeRelation relation() {
		return this.relation;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.relation != null) {
			generator.writeKey("relation");
			this.relation.serialize(generator, mapper);
		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				QueryBase.AbstractBuilder<BuilderT> {
		@Nullable
		private RangeRelation relation;

		/**
		 * Indicates how the range query matches values for <code>range</code> fields.
		 * <p>
		 * API name: {@code relation}
		 */
		public final BuilderT relation(@Nullable RangeRelation value) {
			this.relation = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRangeQueryBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(AbstractBuilder::relation, RangeRelation._DESERIALIZER, "relation");

	}

}
