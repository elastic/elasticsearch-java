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

package co.elastic.clients.elasticsearch.features;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: features.reset_features.Response
@JsonpDeserializable
public final class ResetFeaturesResponse implements JsonpSerializable {
	private final List<Feature> features;

	// ---------------------------------------------------------------------------------------------

	public ResetFeaturesResponse(Builder builder) {

		this.features = ModelTypeHelper.unmodifiableNonNull(builder.features, "features");

	}

	public ResetFeaturesResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code features}
	 */
	public List<Feature> features() {
		return this.features;
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

		generator.writeKey("features");
		generator.writeStartArray();
		for (Feature item0 : this.features) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResetFeaturesResponse}.
	 */
	public static class Builder implements ObjectBuilder<ResetFeaturesResponse> {
		private List<Feature> features;

		/**
		 * API name: {@code features}
		 */
		public Builder features(List<Feature> value) {
			this.features = value;
			return this;
		}

		/**
		 * API name: {@code features}
		 */
		public Builder features(Feature... value) {
			this.features = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #features(List)}, creating the list if needed. 4
		 */
		public Builder addFeatures(Feature value) {
			if (this.features == null) {
				this.features = new ArrayList<>();
			}
			this.features.add(value);
			return this;
		}

		/**
		 * Set {@link #features(List)} to a singleton list.
		 */
		public Builder features(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.features(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Add a value to {@link #features(List)}, creating the list if needed. 5
		 */
		public Builder addFeatures(Function<Feature.Builder, ObjectBuilder<Feature>> fn) {
			return this.addFeatures(fn.apply(new Feature.Builder()).build());
		}

		/**
		 * Builds a {@link ResetFeaturesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResetFeaturesResponse build() {

			return new ResetFeaturesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ResetFeaturesResponse}
	 */
	public static final JsonpDeserializer<ResetFeaturesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ResetFeaturesResponse::setupResetFeaturesResponseDeserializer, Builder::build);

	protected static void setupResetFeaturesResponseDeserializer(
			DelegatingDeserializer<ResetFeaturesResponse.Builder> op) {

		op.add(Builder::features, JsonpDeserializer.arrayDeserializer(Feature._DESERIALIZER), "features");

	}

}
