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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
import co.elastic.clients.elasticsearch.cluster.reroute.RerouteExplanation;
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cluster.reroute.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class RerouteResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final List<RerouteExplanation> explanations;

	@Nullable
	private final JsonData state;

	// ---------------------------------------------------------------------------------------------

	private RerouteResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.explanations = ApiTypeHelper.unmodifiable(builder.explanations);
		this.state = builder.state;

	}

	public static RerouteResponse of(Function<Builder, ObjectBuilder<RerouteResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * API name: {@code explanations}
	 */
	public final List<RerouteExplanation> explanations() {
		return this.explanations;
	}

	/**
	 * There aren't any guarantees on the output/structure of the raw cluster state.
	 * Here you will find the internal representation of the cluster, which can
	 * differ from the external representation.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final JsonData state() {
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		if (ApiTypeHelper.isDefined(this.explanations)) {
			generator.writeKey("explanations");
			generator.writeStartArray();
			for (RerouteExplanation item0 : this.explanations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.state != null) {
			generator.writeKey("state");
			this.state.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RerouteResponse> {
		private Boolean acknowledged;

		@Nullable
		private List<RerouteExplanation> explanations;

		@Nullable
		private JsonData state;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>explanations</code>.
		 */
		public final Builder explanations(List<RerouteExplanation> list) {
			this.explanations = _listAddAll(this.explanations, list);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds one or more values to <code>explanations</code>.
		 */
		public final Builder explanations(RerouteExplanation value, RerouteExplanation... values) {
			this.explanations = _listAdd(this.explanations, value, values);
			return this;
		}

		/**
		 * API name: {@code explanations}
		 * <p>
		 * Adds a value to <code>explanations</code> using a builder lambda.
		 */
		public final Builder explanations(Function<RerouteExplanation.Builder, ObjectBuilder<RerouteExplanation>> fn) {
			return explanations(fn.apply(new RerouteExplanation.Builder()).build());
		}

		/**
		 * There aren't any guarantees on the output/structure of the raw cluster state.
		 * Here you will find the internal representation of the cluster, which can
		 * differ from the external representation.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable JsonData value) {
			this.state = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RerouteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteResponse build() {
			_checkSingleUse();

			return new RerouteResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteResponse}
	 */
	public static final JsonpDeserializer<RerouteResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteResponse::setupRerouteResponseDeserializer);

	protected static void setupRerouteResponseDeserializer(ObjectDeserializer<RerouteResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::explanations, JsonpDeserializer.arrayDeserializer(RerouteExplanation._DESERIALIZER),
				"explanations");
		op.add(Builder::state, JsonData._DESERIALIZER, "state");

	}

}
