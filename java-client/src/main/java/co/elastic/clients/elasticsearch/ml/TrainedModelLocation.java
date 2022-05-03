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

package co.elastic.clients.elasticsearch.ml;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelLocation

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.TrainedModelLocation">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelLocation implements JsonpSerializable {
	private final TrainedModelLocationIndex index;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelLocation(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static TrainedModelLocation of(Function<Builder, ObjectBuilder<TrainedModelLocation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final TrainedModelLocationIndex index() {
		return this.index;
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

		generator.writeKey("index");
		this.index.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelLocation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelLocation> {
		private TrainedModelLocationIndex index;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(TrainedModelLocationIndex value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(
				Function<TrainedModelLocationIndex.Builder, ObjectBuilder<TrainedModelLocationIndex>> fn) {
			return this.index(fn.apply(new TrainedModelLocationIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelLocation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelLocation build() {
			_checkSingleUse();

			return new TrainedModelLocation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelLocation}
	 */
	public static final JsonpDeserializer<TrainedModelLocation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelLocation::setupTrainedModelLocationDeserializer);

	protected static void setupTrainedModelLocationDeserializer(ObjectDeserializer<TrainedModelLocation.Builder> op) {

		op.add(Builder::index, TrainedModelLocationIndex._DESERIALIZER, "index");

	}

}
