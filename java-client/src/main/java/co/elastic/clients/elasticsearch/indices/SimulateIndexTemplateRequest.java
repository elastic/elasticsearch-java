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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.simulate_index_template.Request
@JsonpDeserializable
public class SimulateIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	private final List<String> composedOf;

	private final List<String> indexPatterns;

	private final String name;

	private final List<OverlappingIndexTemplate> overlapping;

	@Nullable
	private final TemplateMapping template;

	// ---------------------------------------------------------------------------------------------

	private SimulateIndexTemplateRequest(Builder builder) {

		this.composedOf = ModelTypeHelper.unmodifiable(builder.composedOf);
		this.indexPatterns = ModelTypeHelper.unmodifiable(builder.indexPatterns);
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.overlapping = ModelTypeHelper.unmodifiable(builder.overlapping);
		this.template = builder.template;

	}

	public static SimulateIndexTemplateRequest of(Function<Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code composed_of}
	 */
	public final List<String> composedOf() {
		return this.composedOf;
	}

	/**
	 * API name: {@code index_patterns}
	 */
	public final List<String> indexPatterns() {
		return this.indexPatterns;
	}

	/**
	 * Required - Index or template name to simulate
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Any overlapping templates that would have matched, but have lower priority
	 * <p>
	 * API name: {@code overlapping}
	 */
	public final List<OverlappingIndexTemplate> overlapping() {
		return this.overlapping;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public final TemplateMapping template() {
		return this.template;
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

		if (ModelTypeHelper.isDefined(this.composedOf)) {
			generator.writeKey("composed_of");
			generator.writeStartArray();
			for (String item0 : this.composedOf) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.indexPatterns)) {
			generator.writeKey("index_patterns");
			generator.writeStartArray();
			for (String item0 : this.indexPatterns) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.overlapping)) {
			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (OverlappingIndexTemplate item0 : this.overlapping) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateIndexTemplateRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimulateIndexTemplateRequest> {
		@Nullable
		private List<String> composedOf;

		@Nullable
		private List<String> indexPatterns;

		private String name;

		@Nullable
		private List<OverlappingIndexTemplate> overlapping;

		@Nullable
		private TemplateMapping template;

		/**
		 * API name: {@code composed_of}
		 */
		public final Builder composedOf(@Nullable List<String> value) {
			this.composedOf = value;
			return this;
		}

		/**
		 * API name: {@code composed_of}
		 */
		public final Builder composedOf(String... value) {
			this.composedOf = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(@Nullable List<String> value) {
			this.indexPatterns = value;
			return this;
		}

		/**
		 * API name: {@code index_patterns}
		 */
		public final Builder indexPatterns(String... value) {
			this.indexPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Index or template name to simulate
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Any overlapping templates that would have matched, but have lower priority
		 * <p>
		 * API name: {@code overlapping}
		 */
		public final Builder overlapping(@Nullable List<OverlappingIndexTemplate> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Any overlapping templates that would have matched, but have lower priority
		 * <p>
		 * API name: {@code overlapping}
		 */
		public final Builder overlapping(OverlappingIndexTemplate... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Any overlapping templates that would have matched, but have lower priority
		 * <p>
		 * API name: {@code overlapping}
		 */
		@SafeVarargs
		public final Builder overlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>>... fns) {
			this.overlapping = new ArrayList<>(fns.length);
			for (Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn : fns) {
				this.overlapping.add(fn.apply(new OverlappingIndexTemplate.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable TemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(Function<TemplateMapping.Builder, ObjectBuilder<TemplateMapping>> fn) {
			return this.template(fn.apply(new TemplateMapping.Builder()).build());
		}

		/**
		 * Builds a {@link SimulateIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIndexTemplateRequest build() {
			_checkSingleUse();

			return new SimulateIndexTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SimulateIndexTemplateRequest}
	 */
	public static final JsonpDeserializer<SimulateIndexTemplateRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, SimulateIndexTemplateRequest::setupSimulateIndexTemplateRequestDeserializer, Builder::build);

	protected static void setupSimulateIndexTemplateRequestDeserializer(
			DelegatingDeserializer<SimulateIndexTemplateRequest.Builder> op) {

		op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"composed_of");
		op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"index_patterns");
		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(OverlappingIndexTemplate._DESERIALIZER),
				"overlapping");
		op.add(Builder::template, TemplateMapping._DESERIALIZER, "template");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_index_template}".
	 */
	public static final Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_index_template");
					buf.append("/_simulate_index");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SimulateIndexTemplateResponse._DESERIALIZER);
}
