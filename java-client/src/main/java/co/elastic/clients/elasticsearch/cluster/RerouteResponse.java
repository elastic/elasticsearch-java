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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.cluster.reroute.RerouteExplanation;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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

// typedef: cluster.reroute.Response
@JsonpDeserializable
public final class RerouteResponse implements JsonpSerializable {
	@Nullable
	private final List<RerouteExplanation> explanations;

	private final JsonData state;

	// ---------------------------------------------------------------------------------------------

	public RerouteResponse(Builder builder) {

		this.explanations = ModelTypeHelper.unmodifiable(builder.explanations);
		this.state = Objects.requireNonNull(builder.state, "state");

	}

	public RerouteResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code explanations}
	 */
	@Nullable
	public List<RerouteExplanation> explanations() {
		return this.explanations;
	}

	/**
	 * There aren't any guarantees on the output/structure of the raw cluster state.
	 * Here you will find the internal representation of the cluster, which can
	 * differ from the external representation.
	 * <p>
	 * API name: {@code state}
	 */
	public JsonData state() {
		return this.state;
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

		if (this.explanations != null) {

			generator.writeKey("explanations");
			generator.writeStartArray();
			for (RerouteExplanation item0 : this.explanations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteResponse}.
	 */
	public static class Builder implements ObjectBuilder<RerouteResponse> {
		@Nullable
		private List<RerouteExplanation> explanations;

		private JsonData state;

		/**
		 * API name: {@code explanations}
		 */
		public Builder explanations(@Nullable List<RerouteExplanation> value) {
			this.explanations = value;
			return this;
		}

		/**
		 * API name: {@code explanations}
		 */
		public Builder explanations(RerouteExplanation... value) {
			this.explanations = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #explanations(List)}, creating the list if needed. 4
		 */
		public Builder addExplanations(RerouteExplanation value) {
			if (this.explanations == null) {
				this.explanations = new ArrayList<>();
			}
			this.explanations.add(value);
			return this;
		}

		/**
		 * Set {@link #explanations(List)} to a singleton list.
		 */
		public Builder explanations(Function<RerouteExplanation.Builder, ObjectBuilder<RerouteExplanation>> fn) {
			return this.explanations(fn.apply(new RerouteExplanation.Builder()).build());
		}

		/**
		 * Add a value to {@link #explanations(List)}, creating the list if needed. 5
		 */
		public Builder addExplanations(Function<RerouteExplanation.Builder, ObjectBuilder<RerouteExplanation>> fn) {
			return this.addExplanations(fn.apply(new RerouteExplanation.Builder()).build());
		}

		/**
		 * There aren't any guarantees on the output/structure of the raw cluster state.
		 * Here you will find the internal representation of the cluster, which can
		 * differ from the external representation.
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(JsonData value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link RerouteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteResponse build() {

			return new RerouteResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteResponse}
	 */
	public static final JsonpDeserializer<RerouteResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteResponse::setupRerouteResponseDeserializer, Builder::build);

	protected static void setupRerouteResponseDeserializer(DelegatingDeserializer<RerouteResponse.Builder> op) {

		op.add(Builder::explanations, JsonpDeserializer.arrayDeserializer(RerouteExplanation._DESERIALIZER),
				"explanations");
		op.add(Builder::state, JsonData._DESERIALIZER, "state");

	}

}
