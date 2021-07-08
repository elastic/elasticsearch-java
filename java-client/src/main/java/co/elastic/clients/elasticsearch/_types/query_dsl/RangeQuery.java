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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RangeQuery
public final class RangeQuery extends QueryBase {
	@Nullable
	private final JsonValue gt;

	@Nullable
	private final JsonValue gte;

	@Nullable
	private final JsonValue lt;

	@Nullable
	private final JsonValue lte;

	@Nullable
	private final JsonValue relation;

	@Nullable
	private final String timeZone;

	@Nullable
	private final JsonValue from;

	@Nullable
	private final JsonValue to;

	// ---------------------------------------------------------------------------------------------

	protected RangeQuery(Builder builder) {
		super(builder);
		this.gt = builder.gt;
		this.gte = builder.gte;
		this.lt = builder.lt;
		this.lte = builder.lte;
		this.relation = builder.relation;
		this.timeZone = builder.timeZone;
		this.from = builder.from;
		this.to = builder.to;

	}

	/**
	 * API name: {@code gt}
	 */
	@Nullable
	public JsonValue gt() {
		return this.gt;
	}

	/**
	 * API name: {@code gte}
	 */
	@Nullable
	public JsonValue gte() {
		return this.gte;
	}

	/**
	 * API name: {@code lt}
	 */
	@Nullable
	public JsonValue lt() {
		return this.lt;
	}

	/**
	 * API name: {@code lte}
	 */
	@Nullable
	public JsonValue lte() {
		return this.lte;
	}

	/**
	 * API name: {@code relation}
	 */
	@Nullable
	public JsonValue relation() {
		return this.relation;
	}

	/**
	 * API name: {@code time_zone}
	 */
	@Nullable
	public String timeZone() {
		return this.timeZone;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public JsonValue from() {
		return this.from;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public JsonValue to() {
		return this.to;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.gt != null) {

			generator.writeKey("gt");
			generator.write(this.gt);

		}
		if (this.gte != null) {

			generator.writeKey("gte");
			generator.write(this.gte);

		}
		if (this.lt != null) {

			generator.writeKey("lt");
			generator.write(this.lt);

		}
		if (this.lte != null) {

			generator.writeKey("lte");
			generator.write(this.lte);

		}
		if (this.relation != null) {

			generator.writeKey("relation");
			generator.write(this.relation);

		}
		if (this.timeZone != null) {

			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.to != null) {

			generator.writeKey("to");
			generator.write(this.to);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RangeQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RangeQuery> {
		@Nullable
		private JsonValue gt;

		@Nullable
		private JsonValue gte;

		@Nullable
		private JsonValue lt;

		@Nullable
		private JsonValue lte;

		@Nullable
		private JsonValue relation;

		@Nullable
		private String timeZone;

		@Nullable
		private JsonValue from;

		@Nullable
		private JsonValue to;

		/**
		 * API name: {@code gt}
		 */
		public Builder gt(@Nullable JsonValue value) {
			this.gt = value;
			return this;
		}

		/**
		 * API name: {@code gte}
		 */
		public Builder gte(@Nullable JsonValue value) {
			this.gte = value;
			return this;
		}

		/**
		 * API name: {@code lt}
		 */
		public Builder lt(@Nullable JsonValue value) {
			this.lt = value;
			return this;
		}

		/**
		 * API name: {@code lte}
		 */
		public Builder lte(@Nullable JsonValue value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code relation}
		 */
		public Builder relation(@Nullable JsonValue value) {
			this.relation = value;
			return this;
		}

		/**
		 * API name: {@code time_zone}
		 */
		public Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable JsonValue value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public Builder to(@Nullable JsonValue value) {
			this.to = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RangeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RangeQuery build() {

			return new RangeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RangeQuery
	 */
	public static final JsonpDeserializer<RangeQuery> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RangeQuery::setupRangeQueryDeserializer);

	protected static void setupRangeQueryDeserializer(DelegatingDeserializer<RangeQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::gt, JsonpDeserializer.jsonValueDeserializer(), "gt");
		op.add(Builder::gte, JsonpDeserializer.jsonValueDeserializer(), "gte");
		op.add(Builder::lt, JsonpDeserializer.jsonValueDeserializer(), "lt");
		op.add(Builder::lte, JsonpDeserializer.jsonValueDeserializer(), "lte");
		op.add(Builder::relation, JsonpDeserializer.jsonValueDeserializer(), "relation");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::from, JsonpDeserializer.jsonValueDeserializer(), "from");
		op.add(Builder::to, JsonpDeserializer.jsonValueDeserializer(), "to");

	}

}
