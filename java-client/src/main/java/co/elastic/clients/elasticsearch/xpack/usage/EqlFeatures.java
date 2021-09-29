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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.EqlFeatures
@JsonpDeserializable
public final class EqlFeatures implements JsonpSerializable {
	private final Number join;

	private final EqlFeaturesJoin joins;

	private final EqlFeaturesKeys keys;

	private final Number event;

	private final EqlFeaturesPipes pipes;

	private final Number sequence;

	private final EqlFeaturesSequences sequences;

	// ---------------------------------------------------------------------------------------------

	public EqlFeatures(Builder builder) {

		this.join = Objects.requireNonNull(builder.join, "join");
		this.joins = Objects.requireNonNull(builder.joins, "joins");
		this.keys = Objects.requireNonNull(builder.keys, "keys");
		this.event = Objects.requireNonNull(builder.event, "event");
		this.pipes = Objects.requireNonNull(builder.pipes, "pipes");
		this.sequence = Objects.requireNonNull(builder.sequence, "sequence");
		this.sequences = Objects.requireNonNull(builder.sequences, "sequences");

	}

	public EqlFeatures(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code join}
	 */
	public Number join() {
		return this.join;
	}

	/**
	 * API name: {@code joins}
	 */
	public EqlFeaturesJoin joins() {
		return this.joins;
	}

	/**
	 * API name: {@code keys}
	 */
	public EqlFeaturesKeys keys() {
		return this.keys;
	}

	/**
	 * API name: {@code event}
	 */
	public Number event() {
		return this.event;
	}

	/**
	 * API name: {@code pipes}
	 */
	public EqlFeaturesPipes pipes() {
		return this.pipes;
	}

	/**
	 * API name: {@code sequence}
	 */
	public Number sequence() {
		return this.sequence;
	}

	/**
	 * API name: {@code sequences}
	 */
	public EqlFeaturesSequences sequences() {
		return this.sequences;
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

		generator.writeKey("join");
		generator.write(this.join.doubleValue());

		generator.writeKey("joins");
		this.joins.serialize(generator, mapper);

		generator.writeKey("keys");
		this.keys.serialize(generator, mapper);

		generator.writeKey("event");
		generator.write(this.event.doubleValue());

		generator.writeKey("pipes");
		this.pipes.serialize(generator, mapper);

		generator.writeKey("sequence");
		generator.write(this.sequence.doubleValue());

		generator.writeKey("sequences");
		this.sequences.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeatures}.
	 */
	public static class Builder implements ObjectBuilder<EqlFeatures> {
		private Number join;

		private EqlFeaturesJoin joins;

		private EqlFeaturesKeys keys;

		private Number event;

		private EqlFeaturesPipes pipes;

		private Number sequence;

		private EqlFeaturesSequences sequences;

		/**
		 * API name: {@code join}
		 */
		public Builder join(Number value) {
			this.join = value;
			return this;
		}

		/**
		 * API name: {@code joins}
		 */
		public Builder joins(EqlFeaturesJoin value) {
			this.joins = value;
			return this;
		}

		/**
		 * API name: {@code joins}
		 */
		public Builder joins(Function<EqlFeaturesJoin.Builder, ObjectBuilder<EqlFeaturesJoin>> fn) {
			return this.joins(fn.apply(new EqlFeaturesJoin.Builder()).build());
		}

		/**
		 * API name: {@code keys}
		 */
		public Builder keys(EqlFeaturesKeys value) {
			this.keys = value;
			return this;
		}

		/**
		 * API name: {@code keys}
		 */
		public Builder keys(Function<EqlFeaturesKeys.Builder, ObjectBuilder<EqlFeaturesKeys>> fn) {
			return this.keys(fn.apply(new EqlFeaturesKeys.Builder()).build());
		}

		/**
		 * API name: {@code event}
		 */
		public Builder event(Number value) {
			this.event = value;
			return this;
		}

		/**
		 * API name: {@code pipes}
		 */
		public Builder pipes(EqlFeaturesPipes value) {
			this.pipes = value;
			return this;
		}

		/**
		 * API name: {@code pipes}
		 */
		public Builder pipes(Function<EqlFeaturesPipes.Builder, ObjectBuilder<EqlFeaturesPipes>> fn) {
			return this.pipes(fn.apply(new EqlFeaturesPipes.Builder()).build());
		}

		/**
		 * API name: {@code sequence}
		 */
		public Builder sequence(Number value) {
			this.sequence = value;
			return this;
		}

		/**
		 * API name: {@code sequences}
		 */
		public Builder sequences(EqlFeaturesSequences value) {
			this.sequences = value;
			return this;
		}

		/**
		 * API name: {@code sequences}
		 */
		public Builder sequences(Function<EqlFeaturesSequences.Builder, ObjectBuilder<EqlFeaturesSequences>> fn) {
			return this.sequences(fn.apply(new EqlFeaturesSequences.Builder()).build());
		}

		/**
		 * Builds a {@link EqlFeatures}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeatures build() {

			return new EqlFeatures(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeatures}
	 */
	public static final JsonpDeserializer<EqlFeatures> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlFeatures::setupEqlFeaturesDeserializer, Builder::build);

	protected static void setupEqlFeaturesDeserializer(DelegatingDeserializer<EqlFeatures.Builder> op) {

		op.add(Builder::join, JsonpDeserializer.numberDeserializer(), "join");
		op.add(Builder::joins, EqlFeaturesJoin._DESERIALIZER, "joins");
		op.add(Builder::keys, EqlFeaturesKeys._DESERIALIZER, "keys");
		op.add(Builder::event, JsonpDeserializer.numberDeserializer(), "event");
		op.add(Builder::pipes, EqlFeaturesPipes._DESERIALIZER, "pipes");
		op.add(Builder::sequence, JsonpDeserializer.numberDeserializer(), "sequence");
		op.add(Builder::sequences, EqlFeaturesSequences._DESERIALIZER, "sequences");

	}

}
