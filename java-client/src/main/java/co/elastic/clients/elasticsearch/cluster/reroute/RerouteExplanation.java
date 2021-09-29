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

package co.elastic.clients.elasticsearch.cluster.reroute;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.RerouteExplanation
@JsonpDeserializable
public final class RerouteExplanation implements JsonpSerializable {
	private final String command;

	private final List<RerouteDecision> decisions;

	private final RerouteParameters parameters;

	// ---------------------------------------------------------------------------------------------

	public RerouteExplanation(Builder builder) {

		this.command = Objects.requireNonNull(builder.command, "command");
		this.decisions = ModelTypeHelper.unmodifiableNonNull(builder.decisions, "decisions");
		this.parameters = Objects.requireNonNull(builder.parameters, "parameters");

	}

	public RerouteExplanation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code command}
	 */
	public String command() {
		return this.command;
	}

	/**
	 * API name: {@code decisions}
	 */
	public List<RerouteDecision> decisions() {
		return this.decisions;
	}

	/**
	 * API name: {@code parameters}
	 */
	public RerouteParameters parameters() {
		return this.parameters;
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

		generator.writeKey("command");
		generator.write(this.command);

		generator.writeKey("decisions");
		generator.writeStartArray();
		for (RerouteDecision item0 : this.decisions) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("parameters");
		this.parameters.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteExplanation}.
	 */
	public static class Builder implements ObjectBuilder<RerouteExplanation> {
		private String command;

		private List<RerouteDecision> decisions;

		private RerouteParameters parameters;

		/**
		 * API name: {@code command}
		 */
		public Builder command(String value) {
			this.command = value;
			return this;
		}

		/**
		 * API name: {@code decisions}
		 */
		public Builder decisions(List<RerouteDecision> value) {
			this.decisions = value;
			return this;
		}

		/**
		 * API name: {@code decisions}
		 */
		public Builder decisions(RerouteDecision... value) {
			this.decisions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #decisions(List)}, creating the list if needed. 4
		 */
		public Builder addDecisions(RerouteDecision value) {
			if (this.decisions == null) {
				this.decisions = new ArrayList<>();
			}
			this.decisions.add(value);
			return this;
		}

		/**
		 * Set {@link #decisions(List)} to a singleton list.
		 */
		public Builder decisions(Function<RerouteDecision.Builder, ObjectBuilder<RerouteDecision>> fn) {
			return this.decisions(fn.apply(new RerouteDecision.Builder()).build());
		}

		/**
		 * Add a value to {@link #decisions(List)}, creating the list if needed. 5
		 */
		public Builder addDecisions(Function<RerouteDecision.Builder, ObjectBuilder<RerouteDecision>> fn) {
			return this.addDecisions(fn.apply(new RerouteDecision.Builder()).build());
		}

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(RerouteParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * API name: {@code parameters}
		 */
		public Builder parameters(Function<RerouteParameters.Builder, ObjectBuilder<RerouteParameters>> fn) {
			return this.parameters(fn.apply(new RerouteParameters.Builder()).build());
		}

		/**
		 * Builds a {@link RerouteExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteExplanation build() {

			return new RerouteExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteExplanation}
	 */
	public static final JsonpDeserializer<RerouteExplanation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RerouteExplanation::setupRerouteExplanationDeserializer, Builder::build);

	protected static void setupRerouteExplanationDeserializer(DelegatingDeserializer<RerouteExplanation.Builder> op) {

		op.add(Builder::command, JsonpDeserializer.stringDeserializer(), "command");
		op.add(Builder::decisions, JsonpDeserializer.arrayDeserializer(RerouteDecision._DESERIALIZER), "decisions");
		op.add(Builder::parameters, RerouteParameters._DESERIALIZER, "parameters");

	}

}
