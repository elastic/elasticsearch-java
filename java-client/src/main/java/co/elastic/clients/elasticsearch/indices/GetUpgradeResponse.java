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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.get_upgrade.Response
public final class GetUpgradeResponse implements ToJsonp {
	@Nullable
	private final List<OverlappingIndexTemplate> overlapping;

	@Nullable
	private final TemplateMapping template;

	// ---------------------------------------------------------------------------------------------

	protected GetUpgradeResponse(Builder builder) {

		this.overlapping = builder.overlapping;
		this.template = builder.template;

	}

	/**
	 * Any templates that were superseded by the specified template.
	 *
	 * API name: {@code overlapping}
	 */
	@Nullable
	public List<OverlappingIndexTemplate> overlapping() {
		return this.overlapping;
	}

	/**
	 * The settings, mappings, and aliases that would be applied to matching
	 * indices.
	 *
	 * API name: {@code template}
	 */
	@Nullable
	public TemplateMapping template() {
		return this.template;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.overlapping != null) {

			generator.writeKey("overlapping");
			generator.writeStartArray();
			for (OverlappingIndexTemplate item0 : this.overlapping) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.template != null) {

			generator.writeKey("template");
			this.template.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetUpgradeResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetUpgradeResponse> {
		@Nullable
		private List<OverlappingIndexTemplate> overlapping;

		@Nullable
		private TemplateMapping template;

		/**
		 * Any templates that were superseded by the specified template.
		 *
		 * API name: {@code overlapping}
		 */
		public Builder overlapping(@Nullable List<OverlappingIndexTemplate> value) {
			this.overlapping = value;
			return this;
		}

		/**
		 * Any templates that were superseded by the specified template.
		 *
		 * API name: {@code overlapping}
		 */
		public Builder overlapping(OverlappingIndexTemplate... value) {
			this.overlapping = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(OverlappingIndexTemplate value) {
			if (this.overlapping == null) {
				this.overlapping = new ArrayList<>();
			}
			this.overlapping.add(value);
			return this;
		}

		/**
		 * Set {@link #overlapping(List)} to a singleton list.
		 */
		public Builder overlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn) {
			return this.overlapping(fn.apply(new OverlappingIndexTemplate.Builder()).build());
		}

		/**
		 * Add a value to {@link #overlapping(List)}, creating the list if needed.
		 */
		public Builder addOverlapping(
				Function<OverlappingIndexTemplate.Builder, ObjectBuilder<OverlappingIndexTemplate>> fn) {
			return this.addOverlapping(fn.apply(new OverlappingIndexTemplate.Builder()).build());
		}

		/**
		 * The settings, mappings, and aliases that would be applied to matching
		 * indices.
		 *
		 * API name: {@code template}
		 */
		public Builder template(@Nullable TemplateMapping value) {
			this.template = value;
			return this;
		}

		/**
		 * The settings, mappings, and aliases that would be applied to matching
		 * indices.
		 *
		 * API name: {@code template}
		 */
		public Builder template(Function<TemplateMapping.Builder, ObjectBuilder<TemplateMapping>> fn) {
			return this.template(fn.apply(new TemplateMapping.Builder()).build());
		}

		/**
		 * Builds a {@link GetUpgradeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUpgradeResponse build() {

			return new GetUpgradeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetUpgradeResponse
	 */
	public static final JsonpDeserializer<GetUpgradeResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetUpgradeResponse::setupGetUpgradeResponseDeserializer);

	protected static void setupGetUpgradeResponseDeserializer(DelegatingDeserializer<GetUpgradeResponse.Builder> op) {

		op.add(Builder::overlapping, JsonpDeserializer.arrayDeserializer(OverlappingIndexTemplate.DESERIALIZER),
				"overlapping");
		op.add(Builder::template, TemplateMapping.DESERIALIZER, "template");

	}

}
