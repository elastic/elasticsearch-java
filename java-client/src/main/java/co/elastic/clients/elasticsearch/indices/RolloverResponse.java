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

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
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

// typedef: indices.rollover.Response
@JsonpDeserializable
public final class RolloverResponse extends AcknowledgedResponseBase {
	private final Map<String, Boolean> conditions;

	private final boolean dryRun;

	private final String newIndex;

	private final String oldIndex;

	private final boolean rolledOver;

	private final boolean shardsAcknowledged;

	// ---------------------------------------------------------------------------------------------

	public RolloverResponse(Builder builder) {
		super(builder);

		this.conditions = ModelTypeHelper.unmodifiableNonNull(builder.conditions, "conditions");
		this.dryRun = Objects.requireNonNull(builder.dryRun, "dry_run");
		this.newIndex = Objects.requireNonNull(builder.newIndex, "new_index");
		this.oldIndex = Objects.requireNonNull(builder.oldIndex, "old_index");
		this.rolledOver = Objects.requireNonNull(builder.rolledOver, "rolled_over");
		this.shardsAcknowledged = Objects.requireNonNull(builder.shardsAcknowledged, "shards_acknowledged");

	}

	public RolloverResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code conditions}
	 */
	public Map<String, Boolean> conditions() {
		return this.conditions;
	}

	/**
	 * API name: {@code dry_run}
	 */
	public boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * API name: {@code new_index}
	 */
	public String newIndex() {
		return this.newIndex;
	}

	/**
	 * API name: {@code old_index}
	 */
	public String oldIndex() {
		return this.oldIndex;
	}

	/**
	 * API name: {@code rolled_over}
	 */
	public boolean rolledOver() {
		return this.rolledOver;
	}

	/**
	 * API name: {@code shards_acknowledged}
	 */
	public boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("conditions");
		generator.writeStartObject();
		for (Map.Entry<String, Boolean> item0 : this.conditions.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("dry_run");
		generator.write(this.dryRun);

		generator.writeKey("new_index");
		generator.write(this.newIndex);

		generator.writeKey("old_index");
		generator.write(this.oldIndex);

		generator.writeKey("rolled_over");
		generator.write(this.rolledOver);

		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RolloverResponse> {
		private Map<String, Boolean> conditions;

		private Boolean dryRun;

		private String newIndex;

		private String oldIndex;

		private Boolean rolledOver;

		private Boolean shardsAcknowledged;

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(Map<String, Boolean> value) {
			this.conditions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #conditions(Map)}, creating the map if needed.
		 */
		public Builder putConditions(String key, Boolean value) {
			if (this.conditions == null) {
				this.conditions = new HashMap<>();
			}
			this.conditions.put(key, value);
			return this;
		}

		/**
		 * API name: {@code dry_run}
		 */
		public Builder dryRun(boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * API name: {@code new_index}
		 */
		public Builder newIndex(String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * API name: {@code old_index}
		 */
		public Builder oldIndex(String value) {
			this.oldIndex = value;
			return this;
		}

		/**
		 * API name: {@code rolled_over}
		 */
		public Builder rolledOver(boolean value) {
			this.rolledOver = value;
			return this;
		}

		/**
		 * API name: {@code shards_acknowledged}
		 */
		public Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RolloverResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverResponse build() {

			return new RolloverResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverResponse}
	 */
	public static final JsonpDeserializer<RolloverResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverResponse::setupRolloverResponseDeserializer, Builder::build);

	protected static void setupRolloverResponseDeserializer(DelegatingDeserializer<RolloverResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::conditions, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.booleanDeserializer()),
				"conditions");
		op.add(Builder::dryRun, JsonpDeserializer.booleanDeserializer(), "dry_run");
		op.add(Builder::newIndex, JsonpDeserializer.stringDeserializer(), "new_index");
		op.add(Builder::oldIndex, JsonpDeserializer.stringDeserializer(), "old_index");
		op.add(Builder::rolledOver, JsonpDeserializer.booleanDeserializer(), "rolled_over");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");

	}

}
