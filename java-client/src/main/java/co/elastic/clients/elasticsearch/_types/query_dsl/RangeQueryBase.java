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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
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

// typedef: _types.query_dsl.RangeQueryBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RangeQueryBase">API
 *      specification</a>
 */

public abstract class RangeQueryBase<T> extends QueryBase {
	@Nullable
	private final RangeRelation relation;

	@Nullable
	private final T gt;

	@Nullable
	private final T gte;

	@Nullable
	private final T lt;

	@Nullable
	private final T lte;

	@Nullable
	private final T from;

	@Nullable
	private final T to;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	protected RangeQueryBase(AbstractBuilder<T, ?> builder) {
		super(builder);

		this.relation = builder.relation;
		this.gt = builder.gt;
		this.gte = builder.gte;
		this.lt = builder.lt;
		this.lte = builder.lte;
		this.from = builder.from;
		this.to = builder.to;
		this.tSerializer = builder.tSerializer;

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

	/**
	 * Greater than.
	 * <p>
	 * API name: {@code gt}
	 */
	@Nullable
	public final T gt() {
		return this.gt;
	}

	/**
	 * Greater than or equal to.
	 * <p>
	 * API name: {@code gte}
	 */
	@Nullable
	public final T gte() {
		return this.gte;
	}

	/**
	 * Less than.
	 * <p>
	 * API name: {@code lt}
	 */
	@Nullable
	public final T lt() {
		return this.lt;
	}

	/**
	 * Less than or equal to.
	 * <p>
	 * API name: {@code lte}
	 */
	@Nullable
	public final T lte() {
		return this.lte;
	}

	/**
	 * API name: {@code from}
	 * 
	 * @deprecated 8.16.0 Use gte or gt instead
	 */
	@Deprecated
	@Nullable
	public final T from() {
		return this.from;
	}

	/**
	 * API name: {@code to}
	 * 
	 * @deprecated 8.16.0 Use lte or lt instead
	 */
	@Deprecated
	@Nullable
	public final T to() {
		return this.to;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.relation != null) {
			generator.writeKey("relation");
			this.relation.serialize(generator, mapper);
		}
		if (this.gt != null) {
			generator.writeKey("gt");
			JsonpUtils.serialize(this.gt, generator, tSerializer, mapper);

		}
		if (this.gte != null) {
			generator.writeKey("gte");
			JsonpUtils.serialize(this.gte, generator, tSerializer, mapper);

		}
		if (this.lt != null) {
			generator.writeKey("lt");
			JsonpUtils.serialize(this.lt, generator, tSerializer, mapper);

		}
		if (this.lte != null) {
			generator.writeKey("lte");
			JsonpUtils.serialize(this.lte, generator, tSerializer, mapper);

		}
		if (this.from != null) {
			generator.writeKey("from");
			JsonpUtils.serialize(this.from, generator, tSerializer, mapper);

		}
		if (this.to != null) {
			generator.writeKey("to");
			JsonpUtils.serialize(this.to, generator, tSerializer, mapper);

		}

	}

	public abstract static class AbstractBuilder<T, BuilderT extends AbstractBuilder<T, BuilderT>>
			extends
				QueryBase.AbstractBuilder<BuilderT> {
		@Nullable
		private RangeRelation relation;

		@Nullable
		private T gt;

		@Nullable
		private T gte;

		@Nullable
		private T lt;

		@Nullable
		private T lte;

		@Nullable
		private T from;

		@Nullable
		private T to;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * Indicates how the range query matches values for <code>range</code> fields.
		 * <p>
		 * API name: {@code relation}
		 */
		public final BuilderT relation(@Nullable RangeRelation value) {
			this.relation = value;
			return self();
		}

		/**
		 * Greater than.
		 * <p>
		 * API name: {@code gt}
		 */
		public final BuilderT gt(@Nullable T value) {
			this.gt = value;
			return self();
		}

		/**
		 * Greater than or equal to.
		 * <p>
		 * API name: {@code gte}
		 */
		public final BuilderT gte(@Nullable T value) {
			this.gte = value;
			return self();
		}

		/**
		 * Less than.
		 * <p>
		 * API name: {@code lt}
		 */
		public final BuilderT lt(@Nullable T value) {
			this.lt = value;
			return self();
		}

		/**
		 * Less than or equal to.
		 * <p>
		 * API name: {@code lte}
		 */
		public final BuilderT lte(@Nullable T value) {
			this.lte = value;
			return self();
		}

		/**
		 * API name: {@code from}
		 * 
		 * @deprecated 8.16.0 Use gte or gt instead
		 */
		@Deprecated
		public final BuilderT from(@Nullable T value) {
			this.from = value;
			return self();
		}

		/**
		 * API name: {@code to}
		 * 
		 * @deprecated 8.16.0 Use lte or lt instead
		 */
		@Deprecated
		public final BuilderT to(@Nullable T value) {
			this.to = value;
			return self();
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public final BuilderT tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <T, BuilderT extends AbstractBuilder<T, BuilderT>> void setupRangeQueryBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<T> tDeserializer) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(AbstractBuilder::relation, RangeRelation._DESERIALIZER, "relation");
		op.add(AbstractBuilder::gt, tDeserializer, "gt");
		op.add(AbstractBuilder::gte, tDeserializer, "gte");
		op.add(AbstractBuilder::lt, tDeserializer, "lt");
		op.add(AbstractBuilder::lte, tDeserializer, "lte");
		op.add(AbstractBuilder::from, tDeserializer, "from");
		op.add(AbstractBuilder::to, tDeserializer, "to");

	}

}
