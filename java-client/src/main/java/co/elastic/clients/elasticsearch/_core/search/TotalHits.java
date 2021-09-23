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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.search._types.TotalHits
public final class TotalHits implements JsonpSerializable {
	private final TotalHitsRelation relation;

	private final Number value;

	// ---------------------------------------------------------------------------------------------

	public TotalHits(Builder builder) {

		this.relation = Objects.requireNonNull(builder.relation, "relation");
		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * API name: {@code relation}
	 */
	public TotalHitsRelation relation() {
		return this.relation;
	}

	/**
	 * API name: {@code value}
	 */
	public Number value() {
		return this.value;
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

		generator.writeKey("relation");
		this.relation.serialize(generator, mapper);

		generator.writeKey("value");
		generator.write(this.value.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TotalHits}.
	 */
	public static class Builder implements ObjectBuilder<TotalHits> {
		private TotalHitsRelation relation;

		private Number value;

		/**
		 * API name: {@code relation}
		 */
		public Builder relation(TotalHitsRelation value) {
			this.relation = value;
			return this;
		}

		/**
		 * API name: {@code value}
		 */
		public Builder value(Number value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds a {@link TotalHits}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TotalHits build() {

			return new TotalHits(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TotalHits}
	 */
	public static final JsonpDeserializer<TotalHits> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TotalHits::setupTotalHitsDeserializer);

	protected static void setupTotalHitsDeserializer(DelegatingDeserializer<TotalHits.Builder> op) {

		op.add(Builder::relation, TotalHitsRelation.DESERIALIZER, "relation");
		op.add(Builder::value, JsonpDeserializer.numberDeserializer(), "value");

	}

}
