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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.RangePropertyBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.RangePropertyBase">API
 *      specification</a>
 */

public abstract class RangePropertyBase extends DocValuesPropertyBase {
	@Nullable
	private final Double boost;

	@Nullable
	private final Boolean coerce;

	@Nullable
	private final Boolean index;

	// ---------------------------------------------------------------------------------------------

	protected RangePropertyBase(AbstractBuilder<?> builder) {
		super(builder);

		this.boost = builder.boost;
		this.coerce = builder.coerce;
		this.index = builder.index;

	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public final Double boost() {
		return this.boost;
	}

	/**
	 * API name: {@code coerce}
	 */
	@Nullable
	public final Boolean coerce() {
		return this.coerce;
	}

	/**
	 * API name: {@code index}
	 */
	@Nullable
	public final Boolean index() {
		return this.index;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.boost != null) {
			generator.writeKey("boost");
			generator.write(this.boost);

		}
		if (this.coerce != null) {
			generator.writeKey("coerce");
			generator.write(this.coerce);

		}
		if (this.index != null) {
			generator.writeKey("index");
			generator.write(this.index);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				DocValuesPropertyBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Double boost;

		@Nullable
		private Boolean coerce;

		@Nullable
		private Boolean index;

		/**
		 * API name: {@code boost}
		 */
		public final BuilderT boost(@Nullable Double value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code coerce}
		 */
		public final BuilderT coerce(@Nullable Boolean value) {
			this.coerce = value;
			return self();
		}

		/**
		 * API name: {@code index}
		 */
		public final BuilderT index(@Nullable Boolean value) {
			this.index = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupRangePropertyBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);
		op.add(AbstractBuilder::boost, JsonpDeserializer.doubleDeserializer(), "boost");
		op.add(AbstractBuilder::coerce, JsonpDeserializer.booleanDeserializer(), "coerce");
		op.add(AbstractBuilder::index, JsonpDeserializer.booleanDeserializer(), "index");

	}

}
