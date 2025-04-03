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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: xpack.usage.EqlFeatures

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.EqlFeatures">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlFeatures implements JsonpSerializable {
	private final Number join;

	private final EqlFeaturesJoin joins;

	private final EqlFeaturesKeys keys;

	private final Number event;

	private final EqlFeaturesPipes pipes;

	private final Number sequence;

	private final EqlFeaturesSequences sequences;

	// ---------------------------------------------------------------------------------------------

	private EqlFeatures(Builder builder) {

		this.join = ApiTypeHelper.requireNonNull(builder.join, this, "join");
		this.joins = ApiTypeHelper.requireNonNull(builder.joins, this, "joins");
		this.keys = ApiTypeHelper.requireNonNull(builder.keys, this, "keys");
		this.event = ApiTypeHelper.requireNonNull(builder.event, this, "event");
		this.pipes = ApiTypeHelper.requireNonNull(builder.pipes, this, "pipes");
		this.sequence = ApiTypeHelper.requireNonNull(builder.sequence, this, "sequence");
		this.sequences = ApiTypeHelper.requireNonNull(builder.sequences, this, "sequences");

	}

	public static EqlFeatures of(Function<Builder, ObjectBuilder<EqlFeatures>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code join}
	 */
	public final Number join() {
		return this.join;
	}

	/**
	 * Required - API name: {@code joins}
	 */
	public final EqlFeaturesJoin joins() {
		return this.joins;
	}

	/**
	 * Required - API name: {@code keys}
	 */
	public final EqlFeaturesKeys keys() {
		return this.keys;
	}

	/**
	 * Required - API name: {@code event}
	 */
	public final Number event() {
		return this.event;
	}

	/**
	 * Required - API name: {@code pipes}
	 */
	public final EqlFeaturesPipes pipes() {
		return this.pipes;
	}

	/**
	 * Required - API name: {@code sequence}
	 */
	public final Number sequence() {
		return this.sequence;
	}

	/**
	 * Required - API name: {@code sequences}
	 */
	public final EqlFeaturesSequences sequences() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeatures}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EqlFeatures> {
		private Number join;

		private EqlFeaturesJoin joins;

		private EqlFeaturesKeys keys;

		private Number event;

		private EqlFeaturesPipes pipes;

		private Number sequence;

		private EqlFeaturesSequences sequences;

		/**
		 * Required - API name: {@code join}
		 */
		public final Builder join(Number value) {
			this.join = value;
			return this;
		}

		/**
		 * Required - API name: {@code joins}
		 */
		public final Builder joins(EqlFeaturesJoin value) {
			this.joins = value;
			return this;
		}

		/**
		 * Required - API name: {@code joins}
		 */
		public final Builder joins(Function<EqlFeaturesJoin.Builder, ObjectBuilder<EqlFeaturesJoin>> fn) {
			return this.joins(fn.apply(new EqlFeaturesJoin.Builder()).build());
		}

		/**
		 * Required - API name: {@code keys}
		 */
		public final Builder keys(EqlFeaturesKeys value) {
			this.keys = value;
			return this;
		}

		/**
		 * Required - API name: {@code keys}
		 */
		public final Builder keys(Function<EqlFeaturesKeys.Builder, ObjectBuilder<EqlFeaturesKeys>> fn) {
			return this.keys(fn.apply(new EqlFeaturesKeys.Builder()).build());
		}

		/**
		 * Required - API name: {@code event}
		 */
		public final Builder event(Number value) {
			this.event = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipes}
		 */
		public final Builder pipes(EqlFeaturesPipes value) {
			this.pipes = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipes}
		 */
		public final Builder pipes(Function<EqlFeaturesPipes.Builder, ObjectBuilder<EqlFeaturesPipes>> fn) {
			return this.pipes(fn.apply(new EqlFeaturesPipes.Builder()).build());
		}

		/**
		 * Required - API name: {@code sequence}
		 */
		public final Builder sequence(Number value) {
			this.sequence = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequences}
		 */
		public final Builder sequences(EqlFeaturesSequences value) {
			this.sequences = value;
			return this;
		}

		/**
		 * Required - API name: {@code sequences}
		 */
		public final Builder sequences(Function<EqlFeaturesSequences.Builder, ObjectBuilder<EqlFeaturesSequences>> fn) {
			return this.sequences(fn.apply(new EqlFeaturesSequences.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EqlFeatures}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeatures build() {
			_checkSingleUse();

			return new EqlFeatures(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeatures}
	 */
	public static final JsonpDeserializer<EqlFeatures> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlFeatures::setupEqlFeaturesDeserializer);

	protected static void setupEqlFeaturesDeserializer(ObjectDeserializer<EqlFeatures.Builder> op) {

		op.add(Builder::join, JsonpDeserializer.numberDeserializer(), "join");
		op.add(Builder::joins, EqlFeaturesJoin._DESERIALIZER, "joins");
		op.add(Builder::keys, EqlFeaturesKeys._DESERIALIZER, "keys");
		op.add(Builder::event, JsonpDeserializer.numberDeserializer(), "event");
		op.add(Builder::pipes, EqlFeaturesPipes._DESERIALIZER, "pipes");
		op.add(Builder::sequence, JsonpDeserializer.numberDeserializer(), "sequence");
		op.add(Builder::sequences, EqlFeaturesSequences._DESERIALIZER, "sequences");

	}

}
