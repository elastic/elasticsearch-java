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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.Objects;

public final class IntervalsQuery extends QueryBase implements Query {

	private final String field;

	private final Intervals intervals;

	@Override
	public String _type() {
		return "intervals";
	}

	public IntervalsQuery(Builder builder) {
		super(builder);
		this.field = Objects.requireNonNull(builder.field, "field");
		this.intervals = Objects.requireNonNull(builder.intervals, "intervals");
	}

	public String field() {
		return this.field;
	}

	public Intervals intervals() {
		return this.intervals;
	}

	@Override
	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());
		super.serializeInternal(generator, mapper);
		generator.writeStartObject(this.field);
		intervals.serialize(generator, mapper);
		generator.writeEnd();
		generator.writeEnd();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<IntervalsQuery> {

		private String field;
		private Intervals intervals;

		public Builder(Object ignore) {
		}

		public Builder() {
		}

		public Builder field(String value) {
			this.field = value;
			return this;
		}

		public Builder intervals(Intervals value) {
			this.intervals = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public IntervalsQuery build() {
			return new IntervalsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<IntervalsQuery.Builder, IntervalsQuery.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(IntervalsQuery::setupIntervalsQueryDeserializer);

	protected static void setupIntervalsQueryDeserializer(DelegatingDeserializer<IntervalsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.setKey(IntervalsQuery.Builder::field);
		op.add(IntervalsQuery.Builder::intervals, Intervals.DESERIALIZER, "intervals");
	}
}
