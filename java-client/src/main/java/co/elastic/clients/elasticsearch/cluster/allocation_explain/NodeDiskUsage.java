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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.NodeDiskUsage
public final class NodeDiskUsage implements ToJsonp {
	private final String nodeName;

	private final DiskUsage leastAvailable;

	private final DiskUsage mostAvailable;

	// ---------------------------------------------------------------------------------------------

	protected NodeDiskUsage(Builder builder) {

		this.nodeName = Objects.requireNonNull(builder.nodeName, "node_name");
		this.leastAvailable = Objects.requireNonNull(builder.leastAvailable, "least_available");
		this.mostAvailable = Objects.requireNonNull(builder.mostAvailable, "most_available");

	}

	/**
	 * API name: {@code node_name}
	 */
	public String nodeName() {
		return this.nodeName;
	}

	/**
	 * API name: {@code least_available}
	 */
	public DiskUsage leastAvailable() {
		return this.leastAvailable;
	}

	/**
	 * API name: {@code most_available}
	 */
	public DiskUsage mostAvailable() {
		return this.mostAvailable;
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

		generator.writeKey("node_name");
		generator.write(this.nodeName);

		generator.writeKey("least_available");
		this.leastAvailable.toJsonp(generator, mapper);

		generator.writeKey("most_available");
		this.mostAvailable.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeDiskUsage}.
	 */
	public static class Builder implements ObjectBuilder<NodeDiskUsage> {
		private String nodeName;

		private DiskUsage leastAvailable;

		private DiskUsage mostAvailable;

		/**
		 * API name: {@code node_name}
		 */
		public Builder nodeName(String value) {
			this.nodeName = value;
			return this;
		}

		/**
		 * API name: {@code least_available}
		 */
		public Builder leastAvailable(DiskUsage value) {
			this.leastAvailable = value;
			return this;
		}

		/**
		 * API name: {@code least_available}
		 */
		public Builder leastAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.leastAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * API name: {@code most_available}
		 */
		public Builder mostAvailable(DiskUsage value) {
			this.mostAvailable = value;
			return this;
		}

		/**
		 * API name: {@code most_available}
		 */
		public Builder mostAvailable(Function<DiskUsage.Builder, ObjectBuilder<DiskUsage>> fn) {
			return this.mostAvailable(fn.apply(new DiskUsage.Builder()).build());
		}

		/**
		 * Builds a {@link NodeDiskUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeDiskUsage build() {

			return new NodeDiskUsage(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeDiskUsage
	 */
	public static final JsonpValueParser<NodeDiskUsage> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeDiskUsage::setupNodeDiskUsageParser);

	protected static void setupNodeDiskUsageParser(DelegatingJsonpValueParser<NodeDiskUsage.Builder> op) {

		op.add(Builder::nodeName, JsonpValueParser.stringParser(), "node_name");
		op.add(Builder::leastAvailable, DiskUsage.JSONP_PARSER, "least_available");
		op.add(Builder::mostAvailable, DiskUsage.JSONP_PARSER, "most_available");

	}

}
