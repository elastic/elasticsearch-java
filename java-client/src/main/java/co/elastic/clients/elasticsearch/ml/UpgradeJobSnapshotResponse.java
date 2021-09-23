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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.upgrade_job_snapshot.Response
public final class UpgradeJobSnapshotResponse implements JsonpSerializable {
	private final String node;

	private final Boolean completed;

	// ---------------------------------------------------------------------------------------------

	public UpgradeJobSnapshotResponse(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.completed = Objects.requireNonNull(builder.completed, "completed");

	}

	/**
	 * The ID of the assigned node for the upgrade task if it is still running.
	 * <p>
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * When true, this means the task is complete. When false, it is still running.
	 * <p>
	 * API name: {@code completed}
	 */
	public Boolean completed() {
		return this.completed;
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

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("completed");
		generator.write(this.completed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpgradeJobSnapshotResponse}.
	 */
	public static class Builder implements ObjectBuilder<UpgradeJobSnapshotResponse> {
		private String node;

		private Boolean completed;

		/**
		 * The ID of the assigned node for the upgrade task if it is still running.
		 * <p>
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * When true, this means the task is complete. When false, it is still running.
		 * <p>
		 * API name: {@code completed}
		 */
		public Builder completed(Boolean value) {
			this.completed = value;
			return this;
		}

		/**
		 * Builds a {@link UpgradeJobSnapshotResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpgradeJobSnapshotResponse build() {

			return new UpgradeJobSnapshotResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpgradeJobSnapshotResponse}
	 */
	public static final JsonpDeserializer<UpgradeJobSnapshotResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpgradeJobSnapshotResponse::setupUpgradeJobSnapshotResponseDeserializer);

	protected static void setupUpgradeJobSnapshotResponseDeserializer(
			DelegatingDeserializer<UpgradeJobSnapshotResponse.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::completed, JsonpDeserializer.booleanDeserializer(), "completed");

	}

}
