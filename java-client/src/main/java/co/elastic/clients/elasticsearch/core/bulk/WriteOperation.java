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

package co.elastic.clients.elasticsearch.core.bulk;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.bulk.WriteOperation

public abstract class WriteOperation extends OperationBase {
	@Nullable
	private final Map<String, String> dynamicTemplates;

	@Nullable
	private final String pipeline;

	@Nullable
	private final Boolean requireAlias;

	// ---------------------------------------------------------------------------------------------

	public WriteOperation(AbstractBuilder<?> builder) {
		super(builder);

		this.dynamicTemplates = ModelTypeHelper.unmodifiable(builder.dynamicTemplates);
		this.pipeline = builder.pipeline;
		this.requireAlias = builder.requireAlias;

	}

	/**
	 * API name: {@code dynamic_templates}
	 */
	@Nullable
	public Map<String, String> dynamicTemplates() {
		return this.dynamicTemplates;
	}

	/**
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * API name: {@code require_alias}
	 */
	@Nullable
	public Boolean requireAlias() {
		return this.requireAlias;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.dynamicTemplates != null) {

			generator.writeKey("dynamic_templates");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.dynamicTemplates.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.pipeline != null) {

			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.requireAlias != null) {

			generator.writeKey("require_alias");
			generator.write(this.requireAlias);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				OperationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Map<String, String> dynamicTemplates;

		@Nullable
		private String pipeline;

		@Nullable
		private Boolean requireAlias;

		/**
		 * API name: {@code dynamic_templates}
		 */
		public BuilderT dynamicTemplates(@Nullable Map<String, String> value) {
			this.dynamicTemplates = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #dynamicTemplates(Map)}, creating the map if
		 * needed.
		 */
		public BuilderT putDynamicTemplates(String key, String value) {
			if (this.dynamicTemplates == null) {
				this.dynamicTemplates = new HashMap<>();
			}
			this.dynamicTemplates.put(key, value);
			return self();
		}

		/**
		 * API name: {@code pipeline}
		 */
		public BuilderT pipeline(@Nullable String value) {
			this.pipeline = value;
			return self();
		}

		/**
		 * API name: {@code require_alias}
		 */
		public BuilderT requireAlias(@Nullable Boolean value) {
			this.requireAlias = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWriteOperationDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		OperationBase.setupOperationBaseDeserializer(op);
		op.add(AbstractBuilder::dynamicTemplates,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "dynamic_templates");
		op.add(AbstractBuilder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline");
		op.add(AbstractBuilder::requireAlias, JsonpDeserializer.booleanDeserializer(), "require_alias");

	}

}
