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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplateNode
public final class ComponentTemplateNode implements ToJsonp {
	private final ComponentTemplateSummary template;

	@Nullable
	private final Number version;

	@Nullable
	private final Map<String, JsonValue> _meta;

	// ---------------------------------------------------------------------------------------------

	protected ComponentTemplateNode(Builder builder) {

		this.template = Objects.requireNonNull(builder.template, "template");
		this.version = builder.version;
		this._meta = builder._meta;

	}

	/**
	 * API name: {@code template}
	 */
	public ComponentTemplateSummary template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonValue> _meta() {
		return this._meta;
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

		generator.writeKey("template");
		this.template.toJsonp(generator, mapper);

		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version.doubleValue());

		}
		if (this._meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this._meta.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplateNode}.
	 */
	public static class Builder implements ObjectBuilder<ComponentTemplateNode> {
		private ComponentTemplateSummary template;

		@Nullable
		private Number version;

		@Nullable
		private Map<String, JsonValue> _meta;

		/**
		 * API name: {@code template}
		 */
		public Builder template(ComponentTemplateSummary value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(
				Function<ComponentTemplateSummary.Builder, ObjectBuilder<ComponentTemplateSummary>> fn) {
			return this.template(fn.apply(new ComponentTemplateSummary.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder _meta(@Nullable Map<String, JsonValue> value) {
			this._meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #_meta(Map)}, creating the map if needed.
		 */
		public Builder put_meta(String key, JsonValue value) {
			if (this._meta == null) {
				this._meta = new HashMap<>();
			}
			this._meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplateNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplateNode build() {

			return new ComponentTemplateNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ComponentTemplateNode
	 */
	public static final JsonpValueParser<ComponentTemplateNode> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ComponentTemplateNode::setupComponentTemplateNodeParser);

	protected static void setupComponentTemplateNodeParser(
			DelegatingJsonpValueParser<ComponentTemplateNode.Builder> op) {

		op.add(Builder::template, ComponentTemplateSummary.JSONP_PARSER, "template");
		op.add(Builder::version, JsonpValueParser.numberParser(), "version");
		op.add(Builder::_meta, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "_meta");

	}

}
